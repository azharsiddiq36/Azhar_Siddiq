package com.azhar.azhar_siddiq.Adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.azhar.azhar_siddiq.Model.ResponseKutipan;
import com.azhar.azhar_siddiq.R;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class KutipanAdapter extends RecyclerView.Adapter<KutipanAdapter.ViewHolder> {
    private List<ResponseKutipan> rvData;
    Context context;
    String language;
    public KutipanAdapter(Context context, List<ResponseKutipan> inputData,String language) {
        this.context = context;
        rvData = inputData;
        this.language = language;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvName, tvText;
        public ViewHolder(View v) {
            super(v);
            tvName = (TextView) v.findViewById(R.id.tvNama);
            tvText = (TextView) v.findViewById(R.id.tvText);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_kutipan, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final ResponseKutipan Kutipan = rvData.get(position);
        holder.tvName.setText(Kutipan.getAuthor());
        if (language.toLowerCase().equals("bosnia")){
            holder.tvText.setText("\""+Kutipan.getSr()+"\"");
        }
        else{
            holder.tvText.setText("\""+Kutipan.getEn()+"\"");
        }

    }

    @Override
    public int getItemCount() {
        return rvData.size();
    }
}


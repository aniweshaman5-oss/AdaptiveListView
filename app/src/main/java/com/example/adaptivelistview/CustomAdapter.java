package com.example.adaptivelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private List<ItemModel> items;

    public CustomAdapter(Context context, List<ItemModel> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        ImageView itemImage = convertView.findViewById(R.id.itemImage);
        TextView itemTitle = convertView.findViewById(R.id.itemTitle);
        TextView itemDescription = convertView.findViewById(R.id.itemDescription);

        ItemModel currentItem = (ItemModel) getItem(position);

        itemImage.setImageResource(currentItem.getImageResource());
        itemTitle.setText(currentItem.getTitle());
        itemDescription.setText(currentItem.getDescription());

        return convertView;
    }
}
package android.dkh.com.housingapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MyPC on 06/04/2018.
 */

public class MyApdater extends ArrayAdapter<String> {
    String [] image;
    int [] image_name;
    Context context;

    public MyApdater(@NonNull Context context, String [] imageHouse, int[] image_nameHouse) {
        super(context, R.layout.listview_item);
        this.image = imageHouse;
        this.image_name = image_nameHouse;
        this.context = context;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();
        if (convertView == null){
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.listview_item, parent, false);
        viewHolder.Image = (ImageView) convertView.findViewById(R.id.image);
        viewHolder.ImageName = (TextView) convertView.findViewById(R.id.image_name);
        convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.Image.setImageResource(image_name[position]);
        viewHolder.ImageName.setText(image[position]);
        return convertView;
    }
    static class ViewHolder{
        ImageView Image;
        TextView ImageName;
    }
}

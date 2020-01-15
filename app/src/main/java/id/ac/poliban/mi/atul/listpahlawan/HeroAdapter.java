package id.ac.poliban.mi.atul.listpahlawan;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class HeroAdapter extends BaseAdapter {
    private List<Hero> heroList = new ArrayList<>();

    public HeroAdapter(List<Hero> heroList) { this.heroList = heroList; }

    @Override
    public int getCount() {
        return heroList.size();
    }

    @Override
    public Object getItem(int position) {
        return heroList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_pahlawan, parent, false);

        //kenalkan view ke object
        ImageView img = convertView.findViewById(R.id.img_hero_image);
        TextView tvHeroName = convertView.findViewById(R.id.tv_hero_name);
        TextView tvHeroDetail = convertView.findViewById(R.id.tv_hero_detail);

        //isi object dengan data
        Glide.with(parent.getContext())
                .load(heroList.get(position).getImage())
                .apply(new RequestOptions().override(90, 55))
                .into(img);
        tvHeroName.setText(heroList.get(position).getHeroName());
        tvHeroDetail.setText(heroList.get(position).getHeroDetail());

        return convertView;
    }
}

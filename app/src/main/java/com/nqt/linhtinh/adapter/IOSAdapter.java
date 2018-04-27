package com.nqt.linhtinh.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nqt.linhtinh.R;
import com.nqt.linhtinh.model.IOS;

import java.util.List;

/**
 * Created by USER on 4/23/2018.
 */

public class IOSAdapter extends RecyclerView.Adapter<IOSAdapter.ViewHolder> {
    private List<IOS> ioes;
    private Context context;
    private LayoutInflater inflater;

    public IOSAdapter(Context context, List<IOS> ioes) {
        this.ioes = ioes;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_ios, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        IOS ios = ioes.get(position);
        holder.getTxtTitle().setText(ios.getTitle());
        holder.getTxtPic().setText(ios.getTitlePic());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Posision" + position, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return ioes.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgPicture;
        private TextView txtTitle;
        private TextView txtPic;

        public ViewHolder(View itemView) {
            super(itemView);
            imgPicture = itemView.findViewById(R.id.img_picture);
            txtPic = itemView.findViewById(R.id.txt_title);
            txtPic = itemView.findViewById(R.id.txt_pic);
        }

        public ImageView getImgPicture() {
            return imgPicture;
        }

        public void setImgPicture(ImageView imgPicture) {
            this.imgPicture = imgPicture;
        }

        public TextView getTxtTitle() {
            return txtTitle;
        }

        public void setTxtTitle(TextView txtTitle) {
            this.txtTitle = txtTitle;
        }

        public TextView getTxtPic() {
            return txtPic;
        }

        public void setTxtPic(TextView txtPic) {
            this.txtPic = txtPic;
        }
    }
}

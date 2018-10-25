package com.hly.search_sqllite;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.List;
/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/10/25~~~~~~
 * ~~~~~~更改时间:2018/10/25~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */
public class SeachRecordAdapter extends BaseRecycleAdapter<String> {
    public SeachRecordAdapter(List<String> datas, Context mContext) {
        super(datas, mContext);
    }

    @Override
    protected void bindData(BaseViewHolder holder, final int position) {

        TextView textView = (TextView) holder.getView(R.id.tv_record);
        textView.setText(datas.get(position));

        //
        holder.getView(R.id.tv_delete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (null != mRvItemOnclickListener) {
                    mRvItemOnclickListener.RvItemOnclick(position);
                }
            }
        });
    }

    @Override
    public int getLayoutId() {
        return R.layout.search_item;
    }

}

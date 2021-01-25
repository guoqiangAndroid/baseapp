package com.yang.base.adapter;


/***
 * @desc 每项长按事件
 * @time 2020-07-01
 * @author yang
 */
public interface BaseAdapterItemLongClickListener<T> {

    /***
     * 每项点击事件
     * @param holder view容器
     * @param position 数据位置
     * @param itemData 数据内容
     */
    void onItemViewLongClick(BaseViewHolder holder, int position, T itemData);


}

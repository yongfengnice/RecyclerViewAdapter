# RecyclerViewAdapter
RecyclerView Adapter,combine with datading,without any findViewById

Usage:

    1. class AppleItemType1 : BaseItemType<MultiTypBean, ViewHolder<ItemBinder1Binding>>(){}
    2. adapter = MultiTypeAdapter<>(context, list)
    3. adapter.addItem(AppleItemType1())
    4. recyclerView.adapter = adapter
    

!['2019-08-13_085821.png'](/arts/2019-08-13_085821.png)
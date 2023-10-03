import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class ItemAdapter(private val contex: Context,private val dataset: List<Affirmation>):
 RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
 class ItemViewHolder(private val view:View):RecyclerView.ViewHolder(view){
   val textView: TextView=view.findViewById(R.id.item_title)

 }

 override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
//  TODO("Not yet implemented")
  val adapterLayout=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
  return ItemViewHolder(adapterLayout)
 }

 override fun getItemCount(): Int {
//  TODO("Not yet implemented")
  return dataset.size
 }

 override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
//  TODO("Not yet implemented")
  val item=dataset[position]
  holder.textView.text=contex.resources.getString(item.stringResourceId)

 }
}
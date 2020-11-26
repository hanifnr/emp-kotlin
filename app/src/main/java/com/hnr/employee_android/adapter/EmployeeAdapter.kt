import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hnr.employee_android.R
import com.hnr.employee_android.bl.Employee
import kotlinx.android.synthetic.main.adapter_employee.view.*

class EmployeeAdapter(private val context: Context, private val employees : ArrayList<Employee>) : RecyclerView.Adapter<EmployeeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view : View = LayoutInflater.from(context).inflate(R.layout.adapter_employee, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var employee : Employee = employees.get(position)
        if (employee.gender.equals("F")) {
            holder.llEmpoloyee.setBackgroundResource(R.drawable.bg_adapter_male)
            holder.ivGender.setImageResource(R.drawable.ic_human_female)
        }
        holder.tvName.text = employee.name
        holder.tvAge.text = employee.age.toString()
    }

    override fun getItemCount() = employees.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), OnClickListener {

        val llEmpoloyee = itemView.adapter_employee_llEmployee
        val ivGender = itemView.adapter_employee_ivGender
        val tvName = itemView.adapter_employee_tvName
        val tvAge = itemView.adapter_employee_tvAge

        override fun onClick(p0: View?) {

        }

    }
}
package `in`.androidcodes.beautifytoast

import android.content.Context
import android.widget.Toast

class ToastMessage {

    fun shortToast(context: Context?, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun longToast(context: Context?, message: String?){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

}
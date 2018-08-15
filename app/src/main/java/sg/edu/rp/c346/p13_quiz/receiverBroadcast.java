package sg.edu.rp.c346.p13_quiz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

public class receiverBroadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
//        Toast my_toast = Toast.makeText(context, "You have changed the wallpaper" , Toast.LENGTH_LONG);
//        my_toast.show();

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
        int id = pref.getInt("id",R.id.radioButtonOp1);
        if (id == R.id.radioButtonOp1){
            Toast.makeText(context, R.string.msg1, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, R.string.msg2, Toast.LENGTH_LONG).show();
        }
    }
}

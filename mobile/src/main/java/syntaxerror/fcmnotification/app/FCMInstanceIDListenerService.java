package syntaxerror.fcmnotification.app;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;


/**
 * Created by shrawan shinde on 12/16/2016.
 */

public class FCMInstanceIDListenerService extends FirebaseInstanceIdService {


    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.e("Refreshed", "Refreshed token: " + refreshedToken);
        // TODO: Implement this method to send any registration to your app's servers.
       // saveRegistrationToServer(refreshedToken);
    }
}
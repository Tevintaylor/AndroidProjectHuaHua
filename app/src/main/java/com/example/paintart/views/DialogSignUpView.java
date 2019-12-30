package com.example.paintart.views;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatDialogFragment;

import com.example.paintart.R;

public class DialogSignUpView extends AppCompatDialogFragment {
    private EditText enterUsername;
    private EditText enterPassword;
    private DialogViewSignUpListener listener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_dialog_signup,null);

        builder.setView(view)
                .setTitle("Sign up here!!!")
                .setNegativeButton("Cancel",new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })

                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String username = enterUsername.getText().toString();
                        String password = enterPassword.getText().toString();
                        listener.SignUp(username,password);

                    }

                });

        enterUsername = view.findViewById(R.id.enterUsername);
        enterPassword = view.findViewById(R.id.enterPassword);

        return builder.create();
    }
    @Override
    public void onAttach(Context context) {

        super.onAttach(context);

        try{
            listener = (DialogViewSignUpListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString()+"Must implement DialogViewListener");
        }

    }

    public interface DialogViewSignUpListener{
        void SignUp(String username, String password);
    }
}

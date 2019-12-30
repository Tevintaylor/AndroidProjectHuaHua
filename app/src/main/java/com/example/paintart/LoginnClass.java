package com.example.paintart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.paintart.views.DialogSignUpView;
import com.example.paintart.views.Users;

import java.util.ArrayList;

public class LoginnClass extends AppCompatActivity  implements DialogSignUpView.DialogViewSignUpListener{
        ArrayList<Users> users = new ArrayList<Users>();

    EditText userName;
    EditText password;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_class);

//      Adding default user to thesystemm to login
        Users u = new Users("Tevin","1234");
        users.add(u);
//        System.out.println(users.toString());

        Button loginBtn = findViewById(R.id.login);
        userName = findViewById(R.id.UserName);
        password = findViewById(R.id.Password);
        signup = findViewById(R.id.signUp);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (Users user: users){
//                    String pass = "1234";
//                    String user = "Tevin";

                    String givenUsername;
                    String givenPassword;
//                  Test statement to make sure elements are being added to the array
//                    System.out.println("-----------------------------------------------------"+users.toString());
//                    System.out.println("-----------------------------------------------------"+user.getPassword()+user.getUserName());

                    givenPassword = String.valueOf(password.getText());
                    givenUsername = String.valueOf(userName.getText());

                    String myString = "Welcome " + givenUsername + " Enjoy your stay";

                    if (givenUsername.equals((user.getUserName())) && givenPassword.equals(user.getPassword())) {
                        Toast.makeText(getApplicationContext(), myString, Toast.LENGTH_LONG).show();
                        goToMain();
                    } else {
                        Toast.makeText(getApplicationContext(), "Invalid Credentials try again", Toast.LENGTH_LONG).show();
                    }
                }

            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }
    public void openDialog () {
        DialogSignUpView dialogViewSignUp = new DialogSignUpView();
        dialogViewSignUp.show(getSupportFragmentManager(), "sign up inforamtion");
    }

    @Override
    public void SignUp (String username, String passWord){
          Users user = new Users(username,passWord);

          users.add(user);
          Toast.makeText(getApplicationContext(), "Successfully signed up enter credentials to login", Toast.LENGTH_LONG).show();
    }

    public void goToMain () {
        Intent intent = new Intent(this, MainActivity.class);
        String st=userName.getText().toString();
        intent.putExtra("username",st);
        startActivity(intent);
        finish();
    }

}

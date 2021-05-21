package com.itfyme.collegesystem.activity.State;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.itfyme.collegesystem.R;
import com.itfyme.collegesystem.activity.BaseActivity;
import com.itfyme.collegesystem.dbservices.StateService;
import com.itfyme.collegesystem.interfaces.ResponseHandler;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class StateAddActivity extends BaseActivity {
    private EditText edtTxtStateName;
    private EditText edtTxtStateCode;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_state_add);
            edtTxtStateName = (EditText) findViewById(R.id.nameEdtTxt);
            edtTxtStateCode = (EditText) findViewById(R.id.codeEdtTxt);
            btnSubmit = (Button) findViewById(R.id.btnSubmit);
            btnSubmit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    postData();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void postData() {
        try {
            String name=edtTxtStateName.getText().toString();
            String code=edtTxtStateCode.getText().toString();
            HashMap<String,String> params=new HashMap<>();
            JSONObject postObj=new JSONObject();
            postObj.put("name",name);
            postObj.put("code",code);
            params.put("state_json",postObj.toString());

            new StateService(this).addState(params, new ResponseHandler() {
                @Override
                public void onSuccess(Object data) {
                    Toast.makeText(StateAddActivity.this,"State added successfully",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent();
                    setResult(AppCompatActivity.RESULT_OK, intent);
                    finish();
                }

                @Override
                public void onFail(Object data) {
                    Toast.makeText(StateAddActivity.this,"Error while adding state",Toast.LENGTH_LONG).show();
                }

                @Override
                public void onNoData(Object data) {

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
package com.itfyme.collegesystem.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.itfyme.collegesystem.R;
import com.itfyme.collegesystem.activity.State.StateAddActivity;

public class DashboardActivity extends AppCompatActivity {
    CardView stateCard, cityCard, univCard, collegeCard, subjectCard,
            branchCard, clgBranchCard, semesterCard, bsSubjectCard, staffCard, studentCard;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);
        try {
            stateCard = (CardView)findViewById(R.id.stateCard);
            cityCard = (CardView)findViewById(R.id.cityCard);
            univCard = (CardView)findViewById(R.id.univCard);
            collegeCard = (CardView)findViewById(R.id.collegeCard);
            subjectCard = (CardView)findViewById(R.id.subjectCard);
            branchCard = (CardView)findViewById(R.id.branchCard);
            clgBranchCard = (CardView)findViewById(R.id.clgBranchCard);
            semesterCard = (CardView)findViewById(R.id.semesterCard);
            bsSubjectCard = (CardView)findViewById(R.id.bsSubjectCard);
            staffCard = (CardView)findViewById(R.id.staffCard);
            studentCard = (CardView)findViewById(R.id.studentCard);

            stateCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent stateIntent = new Intent(getApplicationContext(), StateAddActivity.class);
                    startActivity(stateIntent);
                }
            });

            cityCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            univCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            collegeCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            subjectCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            branchCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            clgBranchCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            semesterCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            bsSubjectCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            staffCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            studentCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

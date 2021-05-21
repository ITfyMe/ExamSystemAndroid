package com.itfyme.collegesystem.activity.Dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import com.itfyme.collegesystem.R;
import com.itfyme.collegesystem.activity.BSSubject.BSSubjectListActivity;
import com.itfyme.collegesystem.activity.BaseActivity;
import com.itfyme.collegesystem.activity.Branch.BranchListActivity;
import com.itfyme.collegesystem.activity.City.CityListActivity;
import com.itfyme.collegesystem.activity.College.CollegeListActivity;
import com.itfyme.collegesystem.activity.CollegeBranch.CollegeBranchListActivity;
import com.itfyme.collegesystem.activity.Semester.SemesterListActivity;
import com.itfyme.collegesystem.activity.Staff.StaffListActivity;
import com.itfyme.collegesystem.activity.State.StateListActivity;
import com.itfyme.collegesystem.activity.Student.StudentListActivity;
import com.itfyme.collegesystem.activity.Subject.SubjectListActivity;
import com.itfyme.collegesystem.activity.University.UniversityListActivity;

public class DashboardActivity extends BaseActivity {
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
                    Intent stateIntent = new Intent(getApplicationContext(), StateListActivity.class);
                    startActivity(stateIntent);
                }
            });

            cityCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent stateIntent = new Intent(getApplicationContext(), CityListActivity.class);
                    startActivity(stateIntent);
                }
            });

            univCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent stateIntent = new Intent(getApplicationContext(), UniversityListActivity.class);
                    startActivity(stateIntent);
                }
            });

            collegeCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent stateIntent = new Intent(getApplicationContext(), CollegeListActivity.class);
                    startActivity(stateIntent);
                }
            });

            subjectCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent stateIntent = new Intent(getApplicationContext(), SubjectListActivity.class);
                    startActivity(stateIntent);
                }
            });

            branchCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent stateIntent = new Intent(getApplicationContext(), BranchListActivity.class);
                    startActivity(stateIntent);
                }
            });

            clgBranchCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent stateIntent = new Intent(getApplicationContext(), CollegeBranchListActivity.class);
                    startActivity(stateIntent);
                }
            });

            semesterCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent stateIntent = new Intent(getApplicationContext(), SemesterListActivity.class);
                    startActivity(stateIntent);
                }
            });

            bsSubjectCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent stateIntent = new Intent(getApplicationContext(), BSSubjectListActivity.class);
                    startActivity(stateIntent);
                }
            });

            staffCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent stateIntent = new Intent(getApplicationContext(), StaffListActivity.class);
                    startActivity(stateIntent);
                }
            });

            studentCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent stateIntent = new Intent(getApplicationContext(), StudentListActivity.class);
                    startActivity(stateIntent);
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

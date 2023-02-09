package com.michelconsulting.firebasecrud;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class DaoEmployee {

    private DatabaseReference databaseReference;

    public DaoEmployee(){
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference(Employee.class.getSimpleName());
    }

    public Task<Void> add(Employee employee){
        return databaseReference.push().setValue(employee);
    }

    public Task<Void> update (String key, HashMap<String, Object> hashMap){
        return databaseReference.child(key).updateChildren(hashMap);
    }

    public Task<Void> remove (String key){
        return databaseReference.child(key).removeValue();
    }
}

package com.example.contact;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class ContactsFragment extends Fragment {

    private ListView listViewContacts;
    private ArrayAdapter<Contact> contactsAdapter;
    private List<Contact> contacts;

    public ContactsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contacts, container, false);

        listViewContacts = view.findViewById(R.id.listViewContacts);
        contacts = new ArrayList<>();

        // Tạo danh sách liên hệ giả định
        contacts.add(new Contact(1, "John Doe", "1234567890", "john@example.com"));
        contacts.add(new Contact(2, "Jane Smith", "0987654321", "jane@example.com"));

        // Khởi tạo ArrayAdapter và gán danh sách liên hệ vào ListView
        contactsAdapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1, contacts);
        listViewContacts.setAdapter(contactsAdapter);

        return view;
    }
}
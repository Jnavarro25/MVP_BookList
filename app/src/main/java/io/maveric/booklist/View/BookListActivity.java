package io.maveric.booklist.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.util.ArrayList;

import io.maveric.booklist.CustomAdapter;
import io.maveric.booklist.Model.Book;
import io.maveric.booklist.Presenter.Contract;
import io.maveric.booklist.Presenter.Presenter;
import io.maveric.booklist.R;

public class BookListActivity extends AppCompatActivity
{
    ListView listViewBooks;
    Presenter presenter;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_book_list);
            presenter= new Presenter(this);
            listViewBooks = (ListView) findViewById(R.id.lv_book_list);
            presenter.getData();
            CustomAdapter customAdapter= presenter.fillBookList(this);
            listViewBooks.setAdapter(customAdapter);

        }

    }

package io.maveric.booklist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import io.maveric.booklist.Model.Book;

public class CustomAdapter extends BaseAdapter
{

    protected Context context;
    protected Activity activity;
    protected ArrayList<Book> informationBook;


    public CustomAdapter(Context context, ArrayList<Book> informationBook)
    {
        this.context=context;
        this.informationBook=informationBook;
    }

    public CustomAdapter(Activity activity, ArrayList<Book> informationBook)
    {
        this.activity=activity;
        this.informationBook=informationBook;
    }

    @Override
    public int getCount() {
        return informationBook.size();
    }

    @Override
    public Object getItem(int i) {
        return informationBook.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) this.activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_book, null);
        }

        Book itemBook = informationBook.get(i);

        ImageView image = (ImageView) view.findViewById(R.id.iv_book);
        Picasso.with(this.activity).load(itemBook.getUrlImage()).into(image);


        TextView bookTitle = (TextView) view.findViewById(R.id.tV_book_title);
        bookTitle.setText(itemBook.getTitle());

        TextView authorName = (TextView) view.findViewById(R.id.tV_author_name);
        authorName.setText(itemBook.getAuthor());

        TextView cathegory = (TextView) view.findViewById(R.id.tV_category);
        cathegory.setText(itemBook.getCategory());

        return view;

    }
}

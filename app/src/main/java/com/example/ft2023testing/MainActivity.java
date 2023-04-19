package com.example.ft2023testing;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import extra.TextCounter;


public class MainActivity extends AppCompatActivity {


    private TextView tvResult;
    private EditText edMain;
    private Spinner spCountingOptions;
    private String wordsSelected;
    private String emptyTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvResult = (TextView) findViewById(R.id.tvResult);
        this.edMain = (EditText) findViewById(R.id.edMain);
        this.spCountingOptions = (Spinner) findViewById(R.id.spCountingOptions);
        this.wordsSelected = getResources().getString(R.string.words_selected);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.options_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spCountingOptions.setAdapter(adapter);
    }

    public void btnCountOnClick(View view) {
        if(edMain.getText().toString().isEmpty()) {
            Toast.makeText(this, emptyTextMessage, Toast.LENGTH_LONG).show();
        } else{
            if(this.spCountingOptions.getSelectedItem().toString().equalsIgnoreCase(wordsSelected)) {
                int wordsCount = TextCounter.getWordsCount(this.edMain.getText().toString());
                String wordsCountFormatted = String.valueOf(wordsCount);
                this.tvResult.setText(wordsCountFormatted);
            } else{
                int charsCount = TextCounter.getCharsCount(this.edMain.getText().toString());
                String charsCountFormatted = String.valueOf(charsCount);
                this.tvResult.setText(charsCountFormatted);
      //  String userInput = this.edMain.getText().toString();
      //  String selectedOption = spCountingOptions.getSelectedItem().toString();
      //  if(selectedOption.equalsIgnoreCase(getResources().getString(R.string.chars_selection))){
      //      this.tvResult.setText(String.valueOf(userInput.length()));
      //  }
      //  else{
      //      Toast.makeText(getApplicationContext(), "Not implemented", Toast.LENGTH_LONG).show();
      //  }
      //  if(selectedOption.equalsIgnoreCase(getResources().getString(R.string.chars_selection)));
      //  else{
      //      if(this.spCountingOptions.getSelectedItem().toString().equalsIgnoreCase(wordsSelected)) {
      //          int wordsCount = TextCounter.getWordsCount(this.edMain.getText().toString());
      //          String wordsCountFormatted = String.valueOf(wordsCount);
      //          this.tvResult.setText(wordsCountFormatted);
            }
}}}
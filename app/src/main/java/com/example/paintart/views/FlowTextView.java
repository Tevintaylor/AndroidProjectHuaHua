package com.example.paintart.views;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.paintart.R;

import java.util.ArrayList;

import static android.view.View.VISIBLE;

public class FlowTextView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flow_text);

        Button solutionButton = findViewById(R.id.solution);
        TextView instruction = findViewById(R.id.topLabel);
        final EditText inputtext = findViewById(R.id.TopTextBox);

        final TextView answer = findViewById(R.id.ButtomLabel);
        answer.setVisibility(View.INVISIBLE);
        final EditText display = findViewById(R.id.ButtomTextBox);
        display.setVisibility(View.INVISIBLE);

//      tester text view for displaying output values
        final TextView tester = findViewById(R.id.tester);


//       action listener for the button
        solutionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//
//          set bottom label and text area to Visible when the bottom is pressed
                answer.setVisibility(VISIBLE);
                display.setVisibility(VISIBLE);

//          collect input from top text area
            String input = String.valueOf(inputtext.getText());

//          Splitting the line of te input by each new line
            String[] multiLines = input.split("\n");

            // code to test if the multitext array works
            for(String d : multiLines){
                System.out.println(d.toString());
            }

//          Calculation for Flow Text
            int lines = inputtext.getLineCount();
//          for loop to loop through lines
                int wordCount = 1;
                int space = 0;

//              Array list to store the converted characters to binary numbers
                ArrayList<Integer> binary = new ArrayList<Integer>(500);

//              find the longest word in a sentence.

//              ArrayList to store all the longest words
                ArrayList<String> longestWords = new ArrayList<String>(500);

//              for loop to loop through the lines in the textArea
                for (String items : multiLines) {

//                  find the longest word in a sentence and its length.
                    LongestWordLength(items);
                    longestWords.add(LongestWord(items));

//                  tester function to print the contents of longestWords Array
                    System.out.print(longestWords.toString());

//                  Array to store the characters from the text Area
                    String[] characters = items.split("");

//                  for loop to loop through each charater in the array list and count the spaces
                    for (String ch : characters) {
//                          tester code to print the lines from the textArea
                            System.out.println(items);
//                          if statement to check if there are spaces in the input
                            if (ch.equals(" ")) {
                                space += 1;
//                                binary.add(items.indexOf(ch));
                                binary.add(0);
//                              if statement to count the number of words in the input
//                              if the number of lines is greater than one then add 1 to compensate for the next line else don't compensate with 1
                                if (lines>1){
                                    wordCount=space+1+1;
//                                System.out.println("# OF SPACES " + space);
                                }else{
                                    wordCount=space+1;
                                }
                            } else {
                                  binary.add(1);
                                  continue;
//                                System.out.println("NO SPACES " + space);
                            }
                        }
                    }
//              set text are on view to the array of words
//                tester.setText(longestWords.toString());

//              return the longest word from the array list on the view
//                tester.setText(getLongestWord(longestWords));


//              code to check the input text.
                String longest=getLongestWord(longestWords);
                int lengthOfLongestWord = longest.length();

//              code to test if the multitext array works
                String output=" ";
                for(String d : multiLines){
                    System.out.println(d.toString());
                    if (d.length()>lengthOfLongestWord){
                        d.replace(" ","\n");
                        output+=d;
                    }
                }

//              adding sample answer to textArea view and text view
                display.setText(output);
                tester.setText(output);

//            print out the contents of the binary array
              System.out.println(binary.toString());


//          set the text are to answer generate
            display.setText(input);

//          sample printable values
            int totalWords = 10;
            int bestWidth = 15;
            int maxFlow = 20;

//          Display the answer in a text view
            answer.setText("Total words: "+wordCount+", Best width: "+ bestWidth+"\n"+
                            "Max flow: "+maxFlow+", Number of lines: "+lines+", spaces: "+space);
            }
        });


//        int main(){
//            int N;
//            while (cin >> N) {
//                int mn = 0;
//                int vector v;
//                for (int i = 0; i < N; i++) {
//                    string s;
//                    cin >> s;
//                    v.push_back(s.size());
//                    mn = max(mn, v.back());
//                }
//                int ret = 0, retw = -1;
//                for (int w = mn; ; w++) {
//                    int vector cur(w), next(w);
//                    int cs = -1, nline = 1;
//                    for (int vi = 0; vi < v.size(); vi++) {
//                        if (cs + v[vi] >= w) {
//                            cur.swap(next);
//                            next = int vector (w);
//                            cs = -1;
//                            nline++;
//                        }
//                        if (cs >= 0) {
//                            next[cs] = max(cue[cs - 1] + 1, max(cur[cs] + 1, cur[cs + 1] + 1));
//                            if (next[cs] > ret) {
//                                ret = next[cs];
//                                retw = w;
//                            }
//                        }
//                        cs += v[vi] + 1;
//                    }
//                    if (ret >= nline) break;
//                }
//                count << retw << ' ' << ret << endl;
//            }
//        }

    }

//      Function that counts the amount of characters in a string
        int LongestWordLength(String str) {
            int n = str.length();
            int res = 0, curr_len = 0;
            for (int i = 0; i < n; i++) {
                // If current character is not
                // end of current word.
                if (str.charAt(i) != ' ')
                    curr_len++;

                    // If end of word is found
                else {
                    res = Math.max(res, curr_len);
                    curr_len = 0;
                }
            }
            // We do max one more time to consider
            // last word as there won't be any space
            // after last word.
            System.out.println(Math.max(res, curr_len));
            return Math.max(res, curr_len);
        }

        String LongestWord (String str){
//          Array to store the words from the text Area
            String[] wordArray = str.split(" ");
            int maxLength = 0;
            String result = "";

            for (int i = 0; i < wordArray.length; i++) {
                if (wordArray[i].length() > maxLength) {
                    maxLength = wordArray[i].length();
                    result = wordArray[i];
                }
            }
            System.out.println(result);
            return result;
        }

        String getLongestWord( ArrayList<String> words) {
            int largestString = words.get(0).length();
            int index = 0;

            for (int i = 0; i < words.size(); i++) {
                if (words.get(i).length() > largestString) {
                    largestString = words.get(i).length();
                    index = i;
                }
            }
            return (words.get(index));
        }





}

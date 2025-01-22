package hahu;

import java.util.ArrayList;

public class Transcribe {
  //A list for the transcribed text
  ArrayList<String> amharic = new ArrayList<String>();
  //Creating an object to access Amharic letters
  Letters letters = new Letters();
  //A variable for the input English text
  String english;

  Transcribe(String english) {
    this.english = english;
  }

  String transcribe() {
    for (int i = 0; i < english.length(); i++) {

      //A switch statement to find and replace characters of English to Amharic
      switch (english.charAt(i)) {
        // ሀ case
        case 'h':
          replaceLetter(letters.h, i, english);
          break;
        // ለ case
        case 'l':
          replaceLetter(letters.l, i, english);
          break;
        // ሐ case
        case 'H':
          replaceLetter(letters.H, i, english);
          break;
        // መ case
        case 'm':
          replaceLetter(letters.m, i, english);
          break;
        // ሠ case
        case 'S':
          replaceLetter(letters.S, i, english);
          break;
        // ረ case
        case 'r':
          replaceLetter(letters.r, i, english);
          break;
        // ሰ case
        case 's':
          replaceLetter(letters.s, i, english);
          break;
        //ሸ case TODO: for double characters
        //ቀ case
        case 'q':
          replaceLetter(letters.q, i, english);
          break;
        //በ case
        case 'b':
          replaceLetter(letters.b, i, english);
          break;
        //ቨ case
        case 'v':
          replaceLetter(letters.v, i, english);
          break;
        //ተ case
        case 't':
          replaceLetter(letters.t, i, english);
          break;
        //ቸ case TODO: for double characters
        //ኀ case
        case 'X':
          replaceLetter(letters.X, i, english);
          break;
        //ነ case
        case 'n':
          replaceLetter(letters.n, i, english);
          break;
        //ኘ case TODO: for double characters
        //አ case TODO: for vowels
        //ከ case
        case 'k':
          replaceLetter(letters.k, i, english);
          break;
        //ኸ case
        case 'x':
          replaceLetter(letters.x, i, english);
          break;
        //ወ case
        case 'w':
          replaceLetter(letters.w, i, english);
          break;
        //ዐ case TODO: for double characters
        //ዘ case
        case 'z':
          replaceLetter(letters.z, i, english);
          break;
        //ዠ case TODO: for double characters
        //የ case
        case 'y':
          replaceLetter(letters.y, i, english);
          break;
        //ደ case
        case 'd':
          replaceLetter(letters.d, i, english);
          break;
        //ጀ case
        case 'j':
          replaceLetter(letters.j, i, english);
          break;
        // ገ case
        case 'g':
          replaceLetter(letters.g, i, english);
          break;
        //ጠ case
        case 'T':
          replaceLetter(letters.T, i, english);
          break;
        // ጨ case TODO: for double characters
        // ጰ case TODO: for double characters
        case 'P':
          replaceLetter(letters.P, i, english);
          break;
        //ጸ case TODO: for double characters
        //ፀ case TODO: for double characters
        //ፈ case
        case 'f':
          replaceLetter(letters.f, i, english);
          break;
        //ፐ case
        case 'p':
          replaceLetter(letters.p, i, english);
          break;
        case '!':
          amharic.add(String.valueOf("!"));
          break;
        case '@':
          amharic.add(String.valueOf("@"));
          break;
        case '#':
          amharic.add(String.valueOf("#"));
          break;
        case '$':
          amharic.add(String.valueOf("$"));
          break;
        case '%':
          amharic.add(String.valueOf("%"));
          break;
        case '^':
          amharic.add(String.valueOf("^"));
          break;
        case '&':
          amharic.add(String.valueOf("&"));
          break;
        case '*':
          amharic.add(String.valueOf("*"));
          break;
        case '(':
          amharic.add(String.valueOf("("));
          break;
        case ')':
          amharic.add(String.valueOf(")"));
          break;
        case '-':
          amharic.add(String.valueOf("-"));
          break;
        case '=':
          amharic.add(String.valueOf("="));
          break;
        case ',':
          amharic.add(String.valueOf("፣"));
          break;
        case '+':
          amharic.add(String.valueOf("+"));
          break;
        case '/':
          amharic.add(String.valueOf("/"));
          break;
        case '\\':
          amharic.add(String.valueOf("\\"));
          break;
        case '?':
          amharic.add(String.valueOf("?"));
          break;
        case '.':
          amharic.add(String.valueOf("።"));
          break;
        case '>':
          amharic.add(String.valueOf(">"));
          break;
        case '<':
          amharic.add(String.valueOf("<"));
          break;
        case ':':
          amharic.add(String.valueOf(":"));
          break;
        case ';':
          amharic.add(String.valueOf(";"));
          break;
        case ' ':
          amharic.add(String.valueOf(" "));
          break;
        case '0':
          amharic.add(String.valueOf("0"));
          break;
        case '1':
          amharic.add(String.valueOf("1"));
          break;
        case '2':
          amharic.add(String.valueOf("2"));
          break;
        case '3':
          amharic.add(String.valueOf("2"));
          break;
        case '4':
          amharic.add(String.valueOf("4"));
          break;
        case '5':
          amharic.add(String.valueOf("5"));
          break;
        case '6':
          amharic.add(String.valueOf("6"));
          break;
        case '7':
          amharic.add(String.valueOf("7"));
          break;
        case '8':
          amharic.add(String.valueOf("8"));
          break;
        case '9':
          amharic.add(String.valueOf("9"));
          break;
      }
    }

    return arrayToString(amharic);
  }

  public String arrayToString(ArrayList<String> strings) {
    String finalString = "";
    for (String string : strings) {
      finalString = finalString + string;
    }

    return finalString;
  }

  void replaceLetter(char[] letter, int i, String english) {
    //Add 1 to the index to get to the next character
    i++;
    //Check if i is exceeded the string length
    if (i != english.length()) {
      // Check the first character
      if (english.charAt(i) == 'e') {
        //Add one to the index to find out the next character is 'e' or not
        i++;
        //If the next character is 'e' then add the fourth character from the list
        if (i < english.length() && english.charAt(i) == 'e') {
          amharic.add(String.valueOf(letter[4]));
        } else {
          //Otherwise add the first character
          amharic.add(String.valueOf(letter[0]));
          //and reset i back to the previous position
          i--;
        }
      } else if (english.charAt(i) == 'u') {
        //Add 1 to the index to get to the next character
        i++;
        //If the next character is a, then it is the seventh character not the second
        if (i < english.length() && english.charAt(i) == 'a') {
          amharic.add(String.valueOf(letter[7]));
        } else {
          //if it is not the seventh character it is the second and reset the position
          amharic.add(String.valueOf(letter[1]));
          i--;
        }
      } else if (english.charAt(i) == 'i') {
        amharic.add(String.valueOf(letter[2]));
      } else if (english.charAt(i) == 'a') {
        amharic.add(String.valueOf(letter[3]));
      } else if (english.charAt(i) == 'o') {
        amharic.add(String.valueOf(letter[6]));
      } else {
        amharic.add(String.valueOf(letter[5]));
        // If none of the above condition mate, reset the position
        // (decrease the one added at the beginning of the if statement)
        i--;
      }
    } else {
      //If i is in the last position and has one character, it definitely the fifth character
      amharic.add(String.valueOf(letter[5]));
    }
  }

}

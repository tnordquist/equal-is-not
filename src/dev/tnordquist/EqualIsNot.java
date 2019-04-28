package dev.tnordquist;

/**
 * CodingBat: Given a string, return true if the number of appearances of "is" anywhere in the
 * string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
 */
public class EqualIsNot {

  public boolean equalIsNot(String str) {

    String isStr = "is";
    int isCt = 0;
    int notCt = 0;

    for (int i = 0; i < str.length(); ++i) {

      if (i < str.length() - 1 && str.substring(i, i + 2).equals("is")) {
        isCt++;
      }
      if (i < str.length() - 2 && str.substring(i, i + 3).equals("not")) {
        notCt++;
      }
    }
    if (isCt == notCt) {
      return true;
    } else {
      return false;
    }
  }

}

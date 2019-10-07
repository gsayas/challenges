public class NextGreatString {

  public String getSolution(String input) {

    StringBuilder builder = new StringBuilder(input);

    int i = 0;
    int t = input.length();
    int j = -1;
    int left, right = 0;

    for (i = 0; i < t - 1; i++) {
      if (input.charAt(i) < input.charAt(i + 1)) {
        j = i;
      }
    }
    left = j;

    if (j == -1) {
      return input;
    } else {
    //Find the highest index j > i such that s[j] > s[i]. Such a j must exist, since i+1 is such an  index.
      for (i = left + 1; i < t; i++) {
        if (input.charAt(i) > input.charAt(left)) {
          right = i;
        }
      }
      //Swap s[i] with s[j].
      swap(builder, left, right);

    }
    //Reverse the order of all of the elements after index 'i' till the last element.
    //reverse(s.begin() + left + 1, s.end());
    StringBuilder output = new StringBuilder();
    output.append(builder.substring(0, left + 1));
    output.append(new StringBuilder(builder.substring(left + 1, input.length())).reverse());

    return output.toString();
  }

  private void swap(StringBuilder builder, int left, int right) {
    char aux = builder.charAt(left);

    builder.setCharAt(left, builder.charAt(right));
    builder.setCharAt(right, aux);
  }

}

package hahu;

public class Main {
  public static void main(String[] args) {
    // Testing Transcribe class ...
    Transcribe transcribe = new Transcribe("selam indeet new?");
    System.out.println(transcribe.transcribe());
  }
}

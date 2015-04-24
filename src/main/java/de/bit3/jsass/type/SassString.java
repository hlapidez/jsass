package de.bit3.jsass.type;

import java.util.stream.IntStream;

/**
 * A sass probably quoted string value.
 */
public class SassString implements CharSequence {

  /**
   * The string value.
   */
  private String value;

  /**
   * Flag if the string is quoted.
   */
  private boolean quoted = true;

  /**
   * The quotation character.
   */
  private char quote = '\'';

  /**
   * Create a new single quoted string value.
   * @param value The string value.
   */
  public SassString(String value) {
    this.value = value;
  }

  /**
   * Create a new potentially quoted string value.
   *
   * @param value The string value.
   * @param quoted Flag if the string is quoted.
   */
  public SassString(String value, boolean quoted) {
    this.value = value;
    this.quoted = quoted;
  }

  /**
   * Create a new potentially quoted string value with specific quotation character.
   *
   * @param value The string value.
   * @param quoted Flag if the string is quoted.
   * @param quote The quotation character.
   */
  public SassString(String value, boolean quoted, char quote) {
    this.value = value;
    this.quoted = quoted;
    this.quote = quote;
  }

  /**
   * Return the string value.
   *
   * @return The string value.
   */
  public String getValue() {
    return value;
  }

  /**
   * Set the string value.
   *
   * @param value The string value.
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Determine if the string is quoted.
   *
   * @return <em>true</em> if the string is quoted.
   */
  public boolean isQuoted() {
    return quoted;
  }

  /**
   * Set if the string is quoted.
   *
   * @param quoted The quotation state.
   */
  public void setQuoted(boolean quoted) {
    this.quoted = quoted;
  }

  /**
   * Return the quotation character.
   *
   * @return The quotation character.
   */
  public char getQuote() {
    return quote;
  }

  /**
   * Set the quotation character.
   *
   * @param quote The quotation character.
   */
  public void setQuote(char quote) {
    this.quote = quote;
  }

  @Override
  public int length() {
    return value.length();
  }

  @Override
  public char charAt(int index) {
    return value.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return value.subSequence(start, end);
  }

  @Override
  public IntStream chars() {
    return value.chars();
  }

  @Override
  public IntStream codePoints() {
    return value.codePoints();
  }

  @Override
  public String toString() {
    return value;
  }
}
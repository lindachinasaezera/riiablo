package com.riiablo.excel2.txt;

import com.riiablo.excel2.Excel;
import com.riiablo.io.ByteInput;
import com.riiablo.io.ByteOutput;

public class MonStats extends Excel<MonStats.Entry, MonStats.Serializer> {
  public MonStats() {
    super(Entry.class);
  }

  @Override
  public Entry newEntry() {
    return new Entry();
  }

  @Override
  public Serializer newSerializer() {
    return new Serializer();
  }

  public static class Entry extends Excel.Entry {
    @Column public String Id;
    @Column public int hcIdx;
  }

  public static class Serializer implements com.riiablo.excel2.Serializer<Entry> {
    @Override public void readBin(Entry entry, ByteInput in) {}
    @Override public void writeBin(Entry entry, ByteOutput out) {}
  }
}
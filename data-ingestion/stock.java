// ORM class for table 'stock'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Oct 17 17:18:18 IST 2017
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class stock extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Long STOCK_ID;
  public Long get_STOCK_ID() {
    return STOCK_ID;
  }
  public void set_STOCK_ID(Long STOCK_ID) {
    this.STOCK_ID = STOCK_ID;
  }
  public stock with_STOCK_ID(Long STOCK_ID) {
    this.STOCK_ID = STOCK_ID;
    return this;
  }
  private String STOCK_CODE;
  public String get_STOCK_CODE() {
    return STOCK_CODE;
  }
  public void set_STOCK_CODE(String STOCK_CODE) {
    this.STOCK_CODE = STOCK_CODE;
  }
  public stock with_STOCK_CODE(String STOCK_CODE) {
    this.STOCK_CODE = STOCK_CODE;
    return this;
  }
  private String STOCK_NAME;
  public String get_STOCK_NAME() {
    return STOCK_NAME;
  }
  public void set_STOCK_NAME(String STOCK_NAME) {
    this.STOCK_NAME = STOCK_NAME;
  }
  public stock with_STOCK_NAME(String STOCK_NAME) {
    this.STOCK_NAME = STOCK_NAME;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof stock)) {
      return false;
    }
    stock that = (stock) o;
    boolean equal = true;
    equal = equal && (this.STOCK_ID == null ? that.STOCK_ID == null : this.STOCK_ID.equals(that.STOCK_ID));
    equal = equal && (this.STOCK_CODE == null ? that.STOCK_CODE == null : this.STOCK_CODE.equals(that.STOCK_CODE));
    equal = equal && (this.STOCK_NAME == null ? that.STOCK_NAME == null : this.STOCK_NAME.equals(that.STOCK_NAME));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof stock)) {
      return false;
    }
    stock that = (stock) o;
    boolean equal = true;
    equal = equal && (this.STOCK_ID == null ? that.STOCK_ID == null : this.STOCK_ID.equals(that.STOCK_ID));
    equal = equal && (this.STOCK_CODE == null ? that.STOCK_CODE == null : this.STOCK_CODE.equals(that.STOCK_CODE));
    equal = equal && (this.STOCK_NAME == null ? that.STOCK_NAME == null : this.STOCK_NAME.equals(that.STOCK_NAME));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.STOCK_ID = JdbcWritableBridge.readLong(1, __dbResults);
    this.STOCK_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.STOCK_NAME = JdbcWritableBridge.readString(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.STOCK_ID = JdbcWritableBridge.readLong(1, __dbResults);
    this.STOCK_CODE = JdbcWritableBridge.readString(2, __dbResults);
    this.STOCK_NAME = JdbcWritableBridge.readString(3, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(STOCK_ID, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(STOCK_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STOCK_NAME, 3 + __off, 12, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(STOCK_ID, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(STOCK_CODE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STOCK_NAME, 3 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.STOCK_ID = null;
    } else {
    this.STOCK_ID = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.STOCK_CODE = null;
    } else {
    this.STOCK_CODE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STOCK_NAME = null;
    } else {
    this.STOCK_NAME = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.STOCK_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.STOCK_ID);
    }
    if (null == this.STOCK_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STOCK_CODE);
    }
    if (null == this.STOCK_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STOCK_NAME);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.STOCK_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.STOCK_ID);
    }
    if (null == this.STOCK_CODE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STOCK_CODE);
    }
    if (null == this.STOCK_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STOCK_NAME);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(STOCK_ID==null?"null":"" + STOCK_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STOCK_CODE==null?"null":STOCK_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STOCK_NAME==null?"null":STOCK_NAME, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(STOCK_ID==null?"null":"" + STOCK_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STOCK_CODE==null?"null":STOCK_CODE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STOCK_NAME==null?"null":STOCK_NAME, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.STOCK_ID = null; } else {
      this.STOCK_ID = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.STOCK_CODE = null; } else {
      this.STOCK_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.STOCK_NAME = null; } else {
      this.STOCK_NAME = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.STOCK_ID = null; } else {
      this.STOCK_ID = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.STOCK_CODE = null; } else {
      this.STOCK_CODE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.STOCK_NAME = null; } else {
      this.STOCK_NAME = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    stock o = (stock) super.clone();
    return o;
  }

  public void clone0(stock o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("STOCK_ID", this.STOCK_ID);
    __sqoop$field_map.put("STOCK_CODE", this.STOCK_CODE);
    __sqoop$field_map.put("STOCK_NAME", this.STOCK_NAME);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("STOCK_ID", this.STOCK_ID);
    __sqoop$field_map.put("STOCK_CODE", this.STOCK_CODE);
    __sqoop$field_map.put("STOCK_NAME", this.STOCK_NAME);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("STOCK_ID".equals(__fieldName)) {
      this.STOCK_ID = (Long) __fieldVal;
    }
    else    if ("STOCK_CODE".equals(__fieldName)) {
      this.STOCK_CODE = (String) __fieldVal;
    }
    else    if ("STOCK_NAME".equals(__fieldName)) {
      this.STOCK_NAME = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("STOCK_ID".equals(__fieldName)) {
      this.STOCK_ID = (Long) __fieldVal;
      return true;
    }
    else    if ("STOCK_CODE".equals(__fieldName)) {
      this.STOCK_CODE = (String) __fieldVal;
      return true;
    }
    else    if ("STOCK_NAME".equals(__fieldName)) {
      this.STOCK_NAME = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

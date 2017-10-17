// ORM class for table 'schedule'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Oct 16 18:38:02 IST 2017
// For connector: org.apache.sqoop.manager.PostgresqlManager
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

public class schedule extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String schedule_code;
  public String get_schedule_code() {
    return schedule_code;
  }
  public void set_schedule_code(String schedule_code) {
    this.schedule_code = schedule_code;
  }
  public schedule with_schedule_code(String schedule_code) {
    this.schedule_code = schedule_code;
    return this;
  }
  private String schedule_name;
  public String get_schedule_name() {
    return schedule_name;
  }
  public void set_schedule_name(String schedule_name) {
    this.schedule_name = schedule_name;
  }
  public schedule with_schedule_name(String schedule_name) {
    this.schedule_name = schedule_name;
    return this;
  }
  private Integer priority_weight;
  public Integer get_priority_weight() {
    return priority_weight;
  }
  public void set_priority_weight(Integer priority_weight) {
    this.priority_weight = priority_weight;
  }
  public schedule with_priority_weight(Integer priority_weight) {
    this.priority_weight = priority_weight;
    return this;
  }
  private java.sql.Date start_date;
  public java.sql.Date get_start_date() {
    return start_date;
  }
  public void set_start_date(java.sql.Date start_date) {
    this.start_date = start_date;
  }
  public schedule with_start_date(java.sql.Date start_date) {
    this.start_date = start_date;
    return this;
  }
  private java.sql.Date stop_date;
  public java.sql.Date get_stop_date() {
    return stop_date;
  }
  public void set_stop_date(java.sql.Date stop_date) {
    this.stop_date = stop_date;
  }
  public schedule with_stop_date(java.sql.Date stop_date) {
    this.stop_date = stop_date;
    return this;
  }
  private String created_by;
  public String get_created_by() {
    return created_by;
  }
  public void set_created_by(String created_by) {
    this.created_by = created_by;
  }
  public schedule with_created_by(String created_by) {
    this.created_by = created_by;
    return this;
  }
  private java.sql.Timestamp created_on;
  public java.sql.Timestamp get_created_on() {
    return created_on;
  }
  public void set_created_on(java.sql.Timestamp created_on) {
    this.created_on = created_on;
  }
  public schedule with_created_on(java.sql.Timestamp created_on) {
    this.created_on = created_on;
    return this;
  }
  private String modified_by;
  public String get_modified_by() {
    return modified_by;
  }
  public void set_modified_by(String modified_by) {
    this.modified_by = modified_by;
  }
  public schedule with_modified_by(String modified_by) {
    this.modified_by = modified_by;
    return this;
  }
  private java.sql.Timestamp modified_on;
  public java.sql.Timestamp get_modified_on() {
    return modified_on;
  }
  public void set_modified_on(java.sql.Timestamp modified_on) {
    this.modified_on = modified_on;
  }
  public schedule with_modified_on(java.sql.Timestamp modified_on) {
    this.modified_on = modified_on;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof schedule)) {
      return false;
    }
    schedule that = (schedule) o;
    boolean equal = true;
    equal = equal && (this.schedule_code == null ? that.schedule_code == null : this.schedule_code.equals(that.schedule_code));
    equal = equal && (this.schedule_name == null ? that.schedule_name == null : this.schedule_name.equals(that.schedule_name));
    equal = equal && (this.priority_weight == null ? that.priority_weight == null : this.priority_weight.equals(that.priority_weight));
    equal = equal && (this.start_date == null ? that.start_date == null : this.start_date.equals(that.start_date));
    equal = equal && (this.stop_date == null ? that.stop_date == null : this.stop_date.equals(that.stop_date));
    equal = equal && (this.created_by == null ? that.created_by == null : this.created_by.equals(that.created_by));
    equal = equal && (this.created_on == null ? that.created_on == null : this.created_on.equals(that.created_on));
    equal = equal && (this.modified_by == null ? that.modified_by == null : this.modified_by.equals(that.modified_by));
    equal = equal && (this.modified_on == null ? that.modified_on == null : this.modified_on.equals(that.modified_on));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof schedule)) {
      return false;
    }
    schedule that = (schedule) o;
    boolean equal = true;
    equal = equal && (this.schedule_code == null ? that.schedule_code == null : this.schedule_code.equals(that.schedule_code));
    equal = equal && (this.schedule_name == null ? that.schedule_name == null : this.schedule_name.equals(that.schedule_name));
    equal = equal && (this.priority_weight == null ? that.priority_weight == null : this.priority_weight.equals(that.priority_weight));
    equal = equal && (this.start_date == null ? that.start_date == null : this.start_date.equals(that.start_date));
    equal = equal && (this.stop_date == null ? that.stop_date == null : this.stop_date.equals(that.stop_date));
    equal = equal && (this.created_by == null ? that.created_by == null : this.created_by.equals(that.created_by));
    equal = equal && (this.created_on == null ? that.created_on == null : this.created_on.equals(that.created_on));
    equal = equal && (this.modified_by == null ? that.modified_by == null : this.modified_by.equals(that.modified_by));
    equal = equal && (this.modified_on == null ? that.modified_on == null : this.modified_on.equals(that.modified_on));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.schedule_code = JdbcWritableBridge.readString(1, __dbResults);
    this.schedule_name = JdbcWritableBridge.readString(2, __dbResults);
    this.priority_weight = JdbcWritableBridge.readInteger(3, __dbResults);
    this.start_date = JdbcWritableBridge.readDate(4, __dbResults);
    this.stop_date = JdbcWritableBridge.readDate(5, __dbResults);
    this.created_by = JdbcWritableBridge.readString(6, __dbResults);
    this.created_on = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.modified_by = JdbcWritableBridge.readString(8, __dbResults);
    this.modified_on = JdbcWritableBridge.readTimestamp(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.schedule_code = JdbcWritableBridge.readString(1, __dbResults);
    this.schedule_name = JdbcWritableBridge.readString(2, __dbResults);
    this.priority_weight = JdbcWritableBridge.readInteger(3, __dbResults);
    this.start_date = JdbcWritableBridge.readDate(4, __dbResults);
    this.stop_date = JdbcWritableBridge.readDate(5, __dbResults);
    this.created_by = JdbcWritableBridge.readString(6, __dbResults);
    this.created_on = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.modified_by = JdbcWritableBridge.readString(8, __dbResults);
    this.modified_on = JdbcWritableBridge.readTimestamp(9, __dbResults);
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
    JdbcWritableBridge.writeString(schedule_code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(schedule_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(priority_weight, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(start_date, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(stop_date, 5 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(created_by, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_on, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(modified_by, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(modified_on, 9 + __off, 93, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(schedule_code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(schedule_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(priority_weight, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(start_date, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(stop_date, 5 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(created_by, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_on, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(modified_by, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(modified_on, 9 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.schedule_code = null;
    } else {
    this.schedule_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.schedule_name = null;
    } else {
    this.schedule_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.priority_weight = null;
    } else {
    this.priority_weight = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.start_date = null;
    } else {
    this.start_date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.stop_date = null;
    } else {
    this.stop_date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.created_by = null;
    } else {
    this.created_by = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.created_on = null;
    } else {
    this.created_on = new Timestamp(__dataIn.readLong());
    this.created_on.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.modified_by = null;
    } else {
    this.modified_by = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.modified_on = null;
    } else {
    this.modified_on = new Timestamp(__dataIn.readLong());
    this.modified_on.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.schedule_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, schedule_code);
    }
    if (null == this.schedule_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, schedule_name);
    }
    if (null == this.priority_weight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.priority_weight);
    }
    if (null == this.start_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start_date.getTime());
    }
    if (null == this.stop_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.stop_date.getTime());
    }
    if (null == this.created_by) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, created_by);
    }
    if (null == this.created_on) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created_on.getTime());
    __dataOut.writeInt(this.created_on.getNanos());
    }
    if (null == this.modified_by) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, modified_by);
    }
    if (null == this.modified_on) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.modified_on.getTime());
    __dataOut.writeInt(this.modified_on.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.schedule_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, schedule_code);
    }
    if (null == this.schedule_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, schedule_name);
    }
    if (null == this.priority_weight) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.priority_weight);
    }
    if (null == this.start_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start_date.getTime());
    }
    if (null == this.stop_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.stop_date.getTime());
    }
    if (null == this.created_by) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, created_by);
    }
    if (null == this.created_on) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created_on.getTime());
    __dataOut.writeInt(this.created_on.getNanos());
    }
    if (null == this.modified_by) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, modified_by);
    }
    if (null == this.modified_on) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.modified_on.getTime());
    __dataOut.writeInt(this.modified_on.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(schedule_code==null?"null":schedule_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(schedule_name==null?"null":schedule_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(priority_weight==null?"null":"" + priority_weight, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_date==null?"null":"" + start_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stop_date==null?"null":"" + stop_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_by==null?"null":created_by, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_on==null?"null":"" + created_on, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modified_by==null?"null":modified_by, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modified_on==null?"null":"" + modified_on, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(schedule_code==null?"null":schedule_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(schedule_name==null?"null":schedule_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(priority_weight==null?"null":"" + priority_weight, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_date==null?"null":"" + start_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stop_date==null?"null":"" + stop_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_by==null?"null":created_by, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_on==null?"null":"" + created_on, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modified_by==null?"null":modified_by, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modified_on==null?"null":"" + modified_on, delimiters));
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
    if (__cur_str.equals("null")) { this.schedule_code = null; } else {
      this.schedule_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.schedule_name = null; } else {
      this.schedule_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.priority_weight = null; } else {
      this.priority_weight = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_date = null; } else {
      this.start_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stop_date = null; } else {
      this.stop_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.created_by = null; } else {
      this.created_by = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created_on = null; } else {
      this.created_on = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.modified_by = null; } else {
      this.modified_by = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.modified_on = null; } else {
      this.modified_on = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.schedule_code = null; } else {
      this.schedule_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.schedule_name = null; } else {
      this.schedule_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.priority_weight = null; } else {
      this.priority_weight = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_date = null; } else {
      this.start_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.stop_date = null; } else {
      this.stop_date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.created_by = null; } else {
      this.created_by = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created_on = null; } else {
      this.created_on = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.modified_by = null; } else {
      this.modified_by = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.modified_on = null; } else {
      this.modified_on = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    schedule o = (schedule) super.clone();
    o.start_date = (o.start_date != null) ? (java.sql.Date) o.start_date.clone() : null;
    o.stop_date = (o.stop_date != null) ? (java.sql.Date) o.stop_date.clone() : null;
    o.created_on = (o.created_on != null) ? (java.sql.Timestamp) o.created_on.clone() : null;
    o.modified_on = (o.modified_on != null) ? (java.sql.Timestamp) o.modified_on.clone() : null;
    return o;
  }

  public void clone0(schedule o) throws CloneNotSupportedException {
    o.start_date = (o.start_date != null) ? (java.sql.Date) o.start_date.clone() : null;
    o.stop_date = (o.stop_date != null) ? (java.sql.Date) o.stop_date.clone() : null;
    o.created_on = (o.created_on != null) ? (java.sql.Timestamp) o.created_on.clone() : null;
    o.modified_on = (o.modified_on != null) ? (java.sql.Timestamp) o.modified_on.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("schedule_code", this.schedule_code);
    __sqoop$field_map.put("schedule_name", this.schedule_name);
    __sqoop$field_map.put("priority_weight", this.priority_weight);
    __sqoop$field_map.put("start_date", this.start_date);
    __sqoop$field_map.put("stop_date", this.stop_date);
    __sqoop$field_map.put("created_by", this.created_by);
    __sqoop$field_map.put("created_on", this.created_on);
    __sqoop$field_map.put("modified_by", this.modified_by);
    __sqoop$field_map.put("modified_on", this.modified_on);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("schedule_code", this.schedule_code);
    __sqoop$field_map.put("schedule_name", this.schedule_name);
    __sqoop$field_map.put("priority_weight", this.priority_weight);
    __sqoop$field_map.put("start_date", this.start_date);
    __sqoop$field_map.put("stop_date", this.stop_date);
    __sqoop$field_map.put("created_by", this.created_by);
    __sqoop$field_map.put("created_on", this.created_on);
    __sqoop$field_map.put("modified_by", this.modified_by);
    __sqoop$field_map.put("modified_on", this.modified_on);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("schedule_code".equals(__fieldName)) {
      this.schedule_code = (String) __fieldVal;
    }
    else    if ("schedule_name".equals(__fieldName)) {
      this.schedule_name = (String) __fieldVal;
    }
    else    if ("priority_weight".equals(__fieldName)) {
      this.priority_weight = (Integer) __fieldVal;
    }
    else    if ("start_date".equals(__fieldName)) {
      this.start_date = (java.sql.Date) __fieldVal;
    }
    else    if ("stop_date".equals(__fieldName)) {
      this.stop_date = (java.sql.Date) __fieldVal;
    }
    else    if ("created_by".equals(__fieldName)) {
      this.created_by = (String) __fieldVal;
    }
    else    if ("created_on".equals(__fieldName)) {
      this.created_on = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("modified_by".equals(__fieldName)) {
      this.modified_by = (String) __fieldVal;
    }
    else    if ("modified_on".equals(__fieldName)) {
      this.modified_on = (java.sql.Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("schedule_code".equals(__fieldName)) {
      this.schedule_code = (String) __fieldVal;
      return true;
    }
    else    if ("schedule_name".equals(__fieldName)) {
      this.schedule_name = (String) __fieldVal;
      return true;
    }
    else    if ("priority_weight".equals(__fieldName)) {
      this.priority_weight = (Integer) __fieldVal;
      return true;
    }
    else    if ("start_date".equals(__fieldName)) {
      this.start_date = (java.sql.Date) __fieldVal;
      return true;
    }
    else    if ("stop_date".equals(__fieldName)) {
      this.stop_date = (java.sql.Date) __fieldVal;
      return true;
    }
    else    if ("created_by".equals(__fieldName)) {
      this.created_by = (String) __fieldVal;
      return true;
    }
    else    if ("created_on".equals(__fieldName)) {
      this.created_on = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("modified_by".equals(__fieldName)) {
      this.modified_by = (String) __fieldVal;
      return true;
    }
    else    if ("modified_on".equals(__fieldName)) {
      this.modified_on = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

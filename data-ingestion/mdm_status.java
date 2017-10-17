// ORM class for table 'mdm_status'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Oct 16 18:31:29 IST 2017
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

public class mdm_status extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String code;
  public String get_code() {
    return code;
  }
  public void set_code(String code) {
    this.code = code;
  }
  public mdm_status with_code(String code) {
    this.code = code;
    return this;
  }
  private String description;
  public String get_description() {
    return description;
  }
  public void set_description(String description) {
    this.description = description;
  }
  public mdm_status with_description(String description) {
    this.description = description;
    return this;
  }
  private String tennant_id;
  public String get_tennant_id() {
    return tennant_id;
  }
  public void set_tennant_id(String tennant_id) {
    this.tennant_id = tennant_id;
  }
  public mdm_status with_tennant_id(String tennant_id) {
    this.tennant_id = tennant_id;
    return this;
  }
  private String status;
  public String get_status() {
    return status;
  }
  public void set_status(String status) {
    this.status = status;
  }
  public mdm_status with_status(String status) {
    this.status = status;
    return this;
  }
  private String created_by;
  public String get_created_by() {
    return created_by;
  }
  public void set_created_by(String created_by) {
    this.created_by = created_by;
  }
  public mdm_status with_created_by(String created_by) {
    this.created_by = created_by;
    return this;
  }
  private java.sql.Time created_on;
  public java.sql.Time get_created_on() {
    return created_on;
  }
  public void set_created_on(java.sql.Time created_on) {
    this.created_on = created_on;
  }
  public mdm_status with_created_on(java.sql.Time created_on) {
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
  public mdm_status with_modified_by(String modified_by) {
    this.modified_by = modified_by;
    return this;
  }
  private java.sql.Time modified_on;
  public java.sql.Time get_modified_on() {
    return modified_on;
  }
  public void set_modified_on(java.sql.Time modified_on) {
    this.modified_on = modified_on;
  }
  public mdm_status with_modified_on(java.sql.Time modified_on) {
    this.modified_on = modified_on;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof mdm_status)) {
      return false;
    }
    mdm_status that = (mdm_status) o;
    boolean equal = true;
    equal = equal && (this.code == null ? that.code == null : this.code.equals(that.code));
    equal = equal && (this.description == null ? that.description == null : this.description.equals(that.description));
    equal = equal && (this.tennant_id == null ? that.tennant_id == null : this.tennant_id.equals(that.tennant_id));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
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
    if (!(o instanceof mdm_status)) {
      return false;
    }
    mdm_status that = (mdm_status) o;
    boolean equal = true;
    equal = equal && (this.code == null ? that.code == null : this.code.equals(that.code));
    equal = equal && (this.description == null ? that.description == null : this.description.equals(that.description));
    equal = equal && (this.tennant_id == null ? that.tennant_id == null : this.tennant_id.equals(that.tennant_id));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.created_by == null ? that.created_by == null : this.created_by.equals(that.created_by));
    equal = equal && (this.created_on == null ? that.created_on == null : this.created_on.equals(that.created_on));
    equal = equal && (this.modified_by == null ? that.modified_by == null : this.modified_by.equals(that.modified_by));
    equal = equal && (this.modified_on == null ? that.modified_on == null : this.modified_on.equals(that.modified_on));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.code = JdbcWritableBridge.readString(1, __dbResults);
    this.description = JdbcWritableBridge.readString(2, __dbResults);
    this.tennant_id = JdbcWritableBridge.readString(3, __dbResults);
    this.status = JdbcWritableBridge.readString(4, __dbResults);
    this.created_by = JdbcWritableBridge.readString(5, __dbResults);
    this.created_on = JdbcWritableBridge.readTime(6, __dbResults);
    this.modified_by = JdbcWritableBridge.readString(7, __dbResults);
    this.modified_on = JdbcWritableBridge.readTime(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.code = JdbcWritableBridge.readString(1, __dbResults);
    this.description = JdbcWritableBridge.readString(2, __dbResults);
    this.tennant_id = JdbcWritableBridge.readString(3, __dbResults);
    this.status = JdbcWritableBridge.readString(4, __dbResults);
    this.created_by = JdbcWritableBridge.readString(5, __dbResults);
    this.created_on = JdbcWritableBridge.readTime(6, __dbResults);
    this.modified_by = JdbcWritableBridge.readString(7, __dbResults);
    this.modified_on = JdbcWritableBridge.readTime(8, __dbResults);
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
    JdbcWritableBridge.writeString(code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(description, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tennant_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(created_by, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTime(created_on, 6 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeString(modified_by, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTime(modified_on, 8 + __off, 92, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(description, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tennant_id, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(created_by, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTime(created_on, 6 + __off, 92, __dbStmt);
    JdbcWritableBridge.writeString(modified_by, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTime(modified_on, 8 + __off, 92, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.code = null;
    } else {
    this.code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.description = null;
    } else {
    this.description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tennant_id = null;
    } else {
    this.tennant_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.status = null;
    } else {
    this.status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.created_by = null;
    } else {
    this.created_by = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.created_on = null;
    } else {
    this.created_on = new Time(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.modified_by = null;
    } else {
    this.modified_by = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.modified_on = null;
    } else {
    this.modified_on = new Time(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, code);
    }
    if (null == this.description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, description);
    }
    if (null == this.tennant_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tennant_id);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
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
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, code);
    }
    if (null == this.description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, description);
    }
    if (null == this.tennant_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tennant_id);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
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
    __sb.append(FieldFormatter.escapeAndEnclose(code==null?"null":code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(description==null?"null":description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tennant_id==null?"null":tennant_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(code==null?"null":code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(description==null?"null":description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tennant_id==null?"null":tennant_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
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
    if (__cur_str.equals("null")) { this.code = null; } else {
      this.code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.description = null; } else {
      this.description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tennant_id = null; } else {
      this.tennant_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.created_by = null; } else {
      this.created_by = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created_on = null; } else {
      this.created_on = java.sql.Time.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.modified_by = null; } else {
      this.modified_by = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.modified_on = null; } else {
      this.modified_on = java.sql.Time.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.code = null; } else {
      this.code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.description = null; } else {
      this.description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tennant_id = null; } else {
      this.tennant_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.created_by = null; } else {
      this.created_by = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created_on = null; } else {
      this.created_on = java.sql.Time.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.modified_by = null; } else {
      this.modified_by = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.modified_on = null; } else {
      this.modified_on = java.sql.Time.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    mdm_status o = (mdm_status) super.clone();
    o.created_on = (o.created_on != null) ? (java.sql.Time) o.created_on.clone() : null;
    o.modified_on = (o.modified_on != null) ? (java.sql.Time) o.modified_on.clone() : null;
    return o;
  }

  public void clone0(mdm_status o) throws CloneNotSupportedException {
    o.created_on = (o.created_on != null) ? (java.sql.Time) o.created_on.clone() : null;
    o.modified_on = (o.modified_on != null) ? (java.sql.Time) o.modified_on.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("code", this.code);
    __sqoop$field_map.put("description", this.description);
    __sqoop$field_map.put("tennant_id", this.tennant_id);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("created_by", this.created_by);
    __sqoop$field_map.put("created_on", this.created_on);
    __sqoop$field_map.put("modified_by", this.modified_by);
    __sqoop$field_map.put("modified_on", this.modified_on);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("code", this.code);
    __sqoop$field_map.put("description", this.description);
    __sqoop$field_map.put("tennant_id", this.tennant_id);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("created_by", this.created_by);
    __sqoop$field_map.put("created_on", this.created_on);
    __sqoop$field_map.put("modified_by", this.modified_by);
    __sqoop$field_map.put("modified_on", this.modified_on);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("code".equals(__fieldName)) {
      this.code = (String) __fieldVal;
    }
    else    if ("description".equals(__fieldName)) {
      this.description = (String) __fieldVal;
    }
    else    if ("tennant_id".equals(__fieldName)) {
      this.tennant_id = (String) __fieldVal;
    }
    else    if ("status".equals(__fieldName)) {
      this.status = (String) __fieldVal;
    }
    else    if ("created_by".equals(__fieldName)) {
      this.created_by = (String) __fieldVal;
    }
    else    if ("created_on".equals(__fieldName)) {
      this.created_on = (java.sql.Time) __fieldVal;
    }
    else    if ("modified_by".equals(__fieldName)) {
      this.modified_by = (String) __fieldVal;
    }
    else    if ("modified_on".equals(__fieldName)) {
      this.modified_on = (java.sql.Time) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("code".equals(__fieldName)) {
      this.code = (String) __fieldVal;
      return true;
    }
    else    if ("description".equals(__fieldName)) {
      this.description = (String) __fieldVal;
      return true;
    }
    else    if ("tennant_id".equals(__fieldName)) {
      this.tennant_id = (String) __fieldVal;
      return true;
    }
    else    if ("status".equals(__fieldName)) {
      this.status = (String) __fieldVal;
      return true;
    }
    else    if ("created_by".equals(__fieldName)) {
      this.created_by = (String) __fieldVal;
      return true;
    }
    else    if ("created_on".equals(__fieldName)) {
      this.created_on = (java.sql.Time) __fieldVal;
      return true;
    }
    else    if ("modified_by".equals(__fieldName)) {
      this.modified_by = (String) __fieldVal;
      return true;
    }
    else    if ("modified_on".equals(__fieldName)) {
      this.modified_on = (java.sql.Time) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

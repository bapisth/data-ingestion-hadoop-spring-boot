// ORM class for table 'cube'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Oct 16 18:50:08 IST 2017
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

public class cube extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String cube_id;
  public String get_cube_id() {
    return cube_id;
  }
  public void set_cube_id(String cube_id) {
    this.cube_id = cube_id;
  }
  public cube with_cube_id(String cube_id) {
    this.cube_id = cube_id;
    return this;
  }
  private String cube_name;
  public String get_cube_name() {
    return cube_name;
  }
  public void set_cube_name(String cube_name) {
    this.cube_name = cube_name;
  }
  public cube with_cube_name(String cube_name) {
    this.cube_name = cube_name;
    return this;
  }
  private java.sql.Timestamp created_on;
  public java.sql.Timestamp get_created_on() {
    return created_on;
  }
  public void set_created_on(java.sql.Timestamp created_on) {
    this.created_on = created_on;
  }
  public cube with_created_on(java.sql.Timestamp created_on) {
    this.created_on = created_on;
    return this;
  }
  private String created_by;
  public String get_created_by() {
    return created_by;
  }
  public void set_created_by(String created_by) {
    this.created_by = created_by;
  }
  public cube with_created_by(String created_by) {
    this.created_by = created_by;
    return this;
  }
  private java.sql.Timestamp modified_on;
  public java.sql.Timestamp get_modified_on() {
    return modified_on;
  }
  public void set_modified_on(java.sql.Timestamp modified_on) {
    this.modified_on = modified_on;
  }
  public cube with_modified_on(java.sql.Timestamp modified_on) {
    this.modified_on = modified_on;
    return this;
  }
  private String modified_by;
  public String get_modified_by() {
    return modified_by;
  }
  public void set_modified_by(String modified_by) {
    this.modified_by = modified_by;
  }
  public cube with_modified_by(String modified_by) {
    this.modified_by = modified_by;
    return this;
  }
  private String cube_metadata;
  public String get_cube_metadata() {
    return cube_metadata;
  }
  public void set_cube_metadata(String cube_metadata) {
    this.cube_metadata = cube_metadata;
  }
  public cube with_cube_metadata(String cube_metadata) {
    this.cube_metadata = cube_metadata;
    return this;
  }
  private Integer version_no;
  public Integer get_version_no() {
    return version_no;
  }
  public void set_version_no(Integer version_no) {
    this.version_no = version_no;
  }
  public cube with_version_no(Integer version_no) {
    this.version_no = version_no;
    return this;
  }
  private String connection_id;
  public String get_connection_id() {
    return connection_id;
  }
  public void set_connection_id(String connection_id) {
    this.connection_id = connection_id;
  }
  public cube with_connection_id(String connection_id) {
    this.connection_id = connection_id;
    return this;
  }
  private String query_type;
  public String get_query_type() {
    return query_type;
  }
  public void set_query_type(String query_type) {
    this.query_type = query_type;
  }
  public cube with_query_type(String query_type) {
    this.query_type = query_type;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof cube)) {
      return false;
    }
    cube that = (cube) o;
    boolean equal = true;
    equal = equal && (this.cube_id == null ? that.cube_id == null : this.cube_id.equals(that.cube_id));
    equal = equal && (this.cube_name == null ? that.cube_name == null : this.cube_name.equals(that.cube_name));
    equal = equal && (this.created_on == null ? that.created_on == null : this.created_on.equals(that.created_on));
    equal = equal && (this.created_by == null ? that.created_by == null : this.created_by.equals(that.created_by));
    equal = equal && (this.modified_on == null ? that.modified_on == null : this.modified_on.equals(that.modified_on));
    equal = equal && (this.modified_by == null ? that.modified_by == null : this.modified_by.equals(that.modified_by));
    equal = equal && (this.cube_metadata == null ? that.cube_metadata == null : this.cube_metadata.equals(that.cube_metadata));
    equal = equal && (this.version_no == null ? that.version_no == null : this.version_no.equals(that.version_no));
    equal = equal && (this.connection_id == null ? that.connection_id == null : this.connection_id.equals(that.connection_id));
    equal = equal && (this.query_type == null ? that.query_type == null : this.query_type.equals(that.query_type));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof cube)) {
      return false;
    }
    cube that = (cube) o;
    boolean equal = true;
    equal = equal && (this.cube_id == null ? that.cube_id == null : this.cube_id.equals(that.cube_id));
    equal = equal && (this.cube_name == null ? that.cube_name == null : this.cube_name.equals(that.cube_name));
    equal = equal && (this.created_on == null ? that.created_on == null : this.created_on.equals(that.created_on));
    equal = equal && (this.created_by == null ? that.created_by == null : this.created_by.equals(that.created_by));
    equal = equal && (this.modified_on == null ? that.modified_on == null : this.modified_on.equals(that.modified_on));
    equal = equal && (this.modified_by == null ? that.modified_by == null : this.modified_by.equals(that.modified_by));
    equal = equal && (this.cube_metadata == null ? that.cube_metadata == null : this.cube_metadata.equals(that.cube_metadata));
    equal = equal && (this.version_no == null ? that.version_no == null : this.version_no.equals(that.version_no));
    equal = equal && (this.connection_id == null ? that.connection_id == null : this.connection_id.equals(that.connection_id));
    equal = equal && (this.query_type == null ? that.query_type == null : this.query_type.equals(that.query_type));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.cube_id = JdbcWritableBridge.readString(1, __dbResults);
    this.cube_name = JdbcWritableBridge.readString(2, __dbResults);
    this.created_on = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.created_by = JdbcWritableBridge.readString(4, __dbResults);
    this.modified_on = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.modified_by = JdbcWritableBridge.readString(6, __dbResults);
    this.cube_metadata = JdbcWritableBridge.readString(7, __dbResults);
    this.version_no = JdbcWritableBridge.readInteger(8, __dbResults);
    this.connection_id = JdbcWritableBridge.readString(9, __dbResults);
    this.query_type = JdbcWritableBridge.readString(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.cube_id = JdbcWritableBridge.readString(1, __dbResults);
    this.cube_name = JdbcWritableBridge.readString(2, __dbResults);
    this.created_on = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.created_by = JdbcWritableBridge.readString(4, __dbResults);
    this.modified_on = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.modified_by = JdbcWritableBridge.readString(6, __dbResults);
    this.cube_metadata = JdbcWritableBridge.readString(7, __dbResults);
    this.version_no = JdbcWritableBridge.readInteger(8, __dbResults);
    this.connection_id = JdbcWritableBridge.readString(9, __dbResults);
    this.query_type = JdbcWritableBridge.readString(10, __dbResults);
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
    JdbcWritableBridge.writeString(cube_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cube_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_on, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(created_by, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(modified_on, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(modified_by, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cube_metadata, 7 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(version_no, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(connection_id, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(query_type, 10 + __off, 12, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(cube_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cube_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_on, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(created_by, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(modified_on, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(modified_by, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cube_metadata, 7 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(version_no, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(connection_id, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(query_type, 10 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.cube_id = null;
    } else {
    this.cube_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cube_name = null;
    } else {
    this.cube_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.created_on = null;
    } else {
    this.created_on = new Timestamp(__dataIn.readLong());
    this.created_on.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.created_by = null;
    } else {
    this.created_by = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.modified_on = null;
    } else {
    this.modified_on = new Timestamp(__dataIn.readLong());
    this.modified_on.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.modified_by = null;
    } else {
    this.modified_by = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cube_metadata = null;
    } else {
    this.cube_metadata = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.version_no = null;
    } else {
    this.version_no = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.connection_id = null;
    } else {
    this.connection_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.query_type = null;
    } else {
    this.query_type = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.cube_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cube_id);
    }
    if (null == this.cube_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cube_name);
    }
    if (null == this.created_on) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created_on.getTime());
    __dataOut.writeInt(this.created_on.getNanos());
    }
    if (null == this.created_by) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, created_by);
    }
    if (null == this.modified_on) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.modified_on.getTime());
    __dataOut.writeInt(this.modified_on.getNanos());
    }
    if (null == this.modified_by) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, modified_by);
    }
    if (null == this.cube_metadata) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cube_metadata);
    }
    if (null == this.version_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.version_no);
    }
    if (null == this.connection_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, connection_id);
    }
    if (null == this.query_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, query_type);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.cube_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cube_id);
    }
    if (null == this.cube_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cube_name);
    }
    if (null == this.created_on) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created_on.getTime());
    __dataOut.writeInt(this.created_on.getNanos());
    }
    if (null == this.created_by) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, created_by);
    }
    if (null == this.modified_on) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.modified_on.getTime());
    __dataOut.writeInt(this.modified_on.getNanos());
    }
    if (null == this.modified_by) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, modified_by);
    }
    if (null == this.cube_metadata) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cube_metadata);
    }
    if (null == this.version_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.version_no);
    }
    if (null == this.connection_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, connection_id);
    }
    if (null == this.query_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, query_type);
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
    __sb.append(FieldFormatter.escapeAndEnclose(cube_id==null?"null":cube_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cube_name==null?"null":cube_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_on==null?"null":"" + created_on, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_by==null?"null":created_by, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modified_on==null?"null":"" + modified_on, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modified_by==null?"null":modified_by, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cube_metadata==null?"null":cube_metadata, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(version_no==null?"null":"" + version_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(connection_id==null?"null":connection_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(query_type==null?"null":query_type, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(cube_id==null?"null":cube_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cube_name==null?"null":cube_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_on==null?"null":"" + created_on, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_by==null?"null":created_by, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modified_on==null?"null":"" + modified_on, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modified_by==null?"null":modified_by, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cube_metadata==null?"null":cube_metadata, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(version_no==null?"null":"" + version_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(connection_id==null?"null":connection_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(query_type==null?"null":query_type, delimiters));
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
    if (__cur_str.equals("null")) { this.cube_id = null; } else {
      this.cube_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cube_name = null; } else {
      this.cube_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created_on = null; } else {
      this.created_on = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.created_by = null; } else {
      this.created_by = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.modified_on = null; } else {
      this.modified_on = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.modified_by = null; } else {
      this.modified_by = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cube_metadata = null; } else {
      this.cube_metadata = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.version_no = null; } else {
      this.version_no = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.connection_id = null; } else {
      this.connection_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.query_type = null; } else {
      this.query_type = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cube_id = null; } else {
      this.cube_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cube_name = null; } else {
      this.cube_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created_on = null; } else {
      this.created_on = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.created_by = null; } else {
      this.created_by = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.modified_on = null; } else {
      this.modified_on = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.modified_by = null; } else {
      this.modified_by = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cube_metadata = null; } else {
      this.cube_metadata = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.version_no = null; } else {
      this.version_no = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.connection_id = null; } else {
      this.connection_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.query_type = null; } else {
      this.query_type = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    cube o = (cube) super.clone();
    o.created_on = (o.created_on != null) ? (java.sql.Timestamp) o.created_on.clone() : null;
    o.modified_on = (o.modified_on != null) ? (java.sql.Timestamp) o.modified_on.clone() : null;
    return o;
  }

  public void clone0(cube o) throws CloneNotSupportedException {
    o.created_on = (o.created_on != null) ? (java.sql.Timestamp) o.created_on.clone() : null;
    o.modified_on = (o.modified_on != null) ? (java.sql.Timestamp) o.modified_on.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("cube_id", this.cube_id);
    __sqoop$field_map.put("cube_name", this.cube_name);
    __sqoop$field_map.put("created_on", this.created_on);
    __sqoop$field_map.put("created_by", this.created_by);
    __sqoop$field_map.put("modified_on", this.modified_on);
    __sqoop$field_map.put("modified_by", this.modified_by);
    __sqoop$field_map.put("cube_metadata", this.cube_metadata);
    __sqoop$field_map.put("version_no", this.version_no);
    __sqoop$field_map.put("connection_id", this.connection_id);
    __sqoop$field_map.put("query_type", this.query_type);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("cube_id", this.cube_id);
    __sqoop$field_map.put("cube_name", this.cube_name);
    __sqoop$field_map.put("created_on", this.created_on);
    __sqoop$field_map.put("created_by", this.created_by);
    __sqoop$field_map.put("modified_on", this.modified_on);
    __sqoop$field_map.put("modified_by", this.modified_by);
    __sqoop$field_map.put("cube_metadata", this.cube_metadata);
    __sqoop$field_map.put("version_no", this.version_no);
    __sqoop$field_map.put("connection_id", this.connection_id);
    __sqoop$field_map.put("query_type", this.query_type);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("cube_id".equals(__fieldName)) {
      this.cube_id = (String) __fieldVal;
    }
    else    if ("cube_name".equals(__fieldName)) {
      this.cube_name = (String) __fieldVal;
    }
    else    if ("created_on".equals(__fieldName)) {
      this.created_on = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("created_by".equals(__fieldName)) {
      this.created_by = (String) __fieldVal;
    }
    else    if ("modified_on".equals(__fieldName)) {
      this.modified_on = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("modified_by".equals(__fieldName)) {
      this.modified_by = (String) __fieldVal;
    }
    else    if ("cube_metadata".equals(__fieldName)) {
      this.cube_metadata = (String) __fieldVal;
    }
    else    if ("version_no".equals(__fieldName)) {
      this.version_no = (Integer) __fieldVal;
    }
    else    if ("connection_id".equals(__fieldName)) {
      this.connection_id = (String) __fieldVal;
    }
    else    if ("query_type".equals(__fieldName)) {
      this.query_type = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("cube_id".equals(__fieldName)) {
      this.cube_id = (String) __fieldVal;
      return true;
    }
    else    if ("cube_name".equals(__fieldName)) {
      this.cube_name = (String) __fieldVal;
      return true;
    }
    else    if ("created_on".equals(__fieldName)) {
      this.created_on = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("created_by".equals(__fieldName)) {
      this.created_by = (String) __fieldVal;
      return true;
    }
    else    if ("modified_on".equals(__fieldName)) {
      this.modified_on = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("modified_by".equals(__fieldName)) {
      this.modified_by = (String) __fieldVal;
      return true;
    }
    else    if ("cube_metadata".equals(__fieldName)) {
      this.cube_metadata = (String) __fieldVal;
      return true;
    }
    else    if ("version_no".equals(__fieldName)) {
      this.version_no = (Integer) __fieldVal;
      return true;
    }
    else    if ("connection_id".equals(__fieldName)) {
      this.connection_id = (String) __fieldVal;
      return true;
    }
    else    if ("query_type".equals(__fieldName)) {
      this.query_type = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

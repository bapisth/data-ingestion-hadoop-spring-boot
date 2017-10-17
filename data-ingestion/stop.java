// ORM class for table 'stop'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Oct 16 18:34:34 IST 2017
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

public class stop extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String station_code;
  public String get_station_code() {
    return station_code;
  }
  public void set_station_code(String station_code) {
    this.station_code = station_code;
  }
  public stop with_station_code(String station_code) {
    this.station_code = station_code;
    return this;
  }
  private String stop_code;
  public String get_stop_code() {
    return stop_code;
  }
  public void set_stop_code(String stop_code) {
    this.stop_code = stop_code;
  }
  public stop with_stop_code(String stop_code) {
    this.stop_code = stop_code;
    return this;
  }
  private String stop_name;
  public String get_stop_name() {
    return stop_name;
  }
  public void set_stop_name(String stop_name) {
    this.stop_name = stop_name;
  }
  public stop with_stop_name(String stop_name) {
    this.stop_name = stop_name;
    return this;
  }
  private String short_stop_name;
  public String get_short_stop_name() {
    return short_stop_name;
  }
  public void set_short_stop_name(String short_stop_name) {
    this.short_stop_name = short_stop_name;
  }
  public stop with_short_stop_name(String short_stop_name) {
    this.short_stop_name = short_stop_name;
    return this;
  }
  private String stop_type;
  public String get_stop_type() {
    return stop_type;
  }
  public void set_stop_type(String stop_type) {
    this.stop_type = stop_type;
  }
  public stop with_stop_type(String stop_type) {
    this.stop_type = stop_type;
    return this;
  }
  private String status;
  public String get_status() {
    return status;
  }
  public void set_status(String status) {
    this.status = status;
  }
  public stop with_status(String status) {
    this.status = status;
    return this;
  }
  private java.math.BigDecimal arrival_trigger_distance;
  public java.math.BigDecimal get_arrival_trigger_distance() {
    return arrival_trigger_distance;
  }
  public void set_arrival_trigger_distance(java.math.BigDecimal arrival_trigger_distance) {
    this.arrival_trigger_distance = arrival_trigger_distance;
  }
  public stop with_arrival_trigger_distance(java.math.BigDecimal arrival_trigger_distance) {
    this.arrival_trigger_distance = arrival_trigger_distance;
    return this;
  }
  private java.math.BigDecimal departure_trigger_distance;
  public java.math.BigDecimal get_departure_trigger_distance() {
    return departure_trigger_distance;
  }
  public void set_departure_trigger_distance(java.math.BigDecimal departure_trigger_distance) {
    this.departure_trigger_distance = departure_trigger_distance;
  }
  public stop with_departure_trigger_distance(java.math.BigDecimal departure_trigger_distance) {
    this.departure_trigger_distance = departure_trigger_distance;
    return this;
  }
  private String position;
  public String get_position() {
    return position;
  }
  public void set_position(String position) {
    this.position = position;
  }
  public stop with_position(String position) {
    this.position = position;
    return this;
  }
  private String created_by;
  public String get_created_by() {
    return created_by;
  }
  public void set_created_by(String created_by) {
    this.created_by = created_by;
  }
  public stop with_created_by(String created_by) {
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
  public stop with_created_on(java.sql.Timestamp created_on) {
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
  public stop with_modified_by(String modified_by) {
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
  public stop with_modified_on(java.sql.Timestamp modified_on) {
    this.modified_on = modified_on;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof stop)) {
      return false;
    }
    stop that = (stop) o;
    boolean equal = true;
    equal = equal && (this.station_code == null ? that.station_code == null : this.station_code.equals(that.station_code));
    equal = equal && (this.stop_code == null ? that.stop_code == null : this.stop_code.equals(that.stop_code));
    equal = equal && (this.stop_name == null ? that.stop_name == null : this.stop_name.equals(that.stop_name));
    equal = equal && (this.short_stop_name == null ? that.short_stop_name == null : this.short_stop_name.equals(that.short_stop_name));
    equal = equal && (this.stop_type == null ? that.stop_type == null : this.stop_type.equals(that.stop_type));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.arrival_trigger_distance == null ? that.arrival_trigger_distance == null : this.arrival_trigger_distance.equals(that.arrival_trigger_distance));
    equal = equal && (this.departure_trigger_distance == null ? that.departure_trigger_distance == null : this.departure_trigger_distance.equals(that.departure_trigger_distance));
    equal = equal && (this.position == null ? that.position == null : this.position.equals(that.position));
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
    if (!(o instanceof stop)) {
      return false;
    }
    stop that = (stop) o;
    boolean equal = true;
    equal = equal && (this.station_code == null ? that.station_code == null : this.station_code.equals(that.station_code));
    equal = equal && (this.stop_code == null ? that.stop_code == null : this.stop_code.equals(that.stop_code));
    equal = equal && (this.stop_name == null ? that.stop_name == null : this.stop_name.equals(that.stop_name));
    equal = equal && (this.short_stop_name == null ? that.short_stop_name == null : this.short_stop_name.equals(that.short_stop_name));
    equal = equal && (this.stop_type == null ? that.stop_type == null : this.stop_type.equals(that.stop_type));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.arrival_trigger_distance == null ? that.arrival_trigger_distance == null : this.arrival_trigger_distance.equals(that.arrival_trigger_distance));
    equal = equal && (this.departure_trigger_distance == null ? that.departure_trigger_distance == null : this.departure_trigger_distance.equals(that.departure_trigger_distance));
    equal = equal && (this.position == null ? that.position == null : this.position.equals(that.position));
    equal = equal && (this.created_by == null ? that.created_by == null : this.created_by.equals(that.created_by));
    equal = equal && (this.created_on == null ? that.created_on == null : this.created_on.equals(that.created_on));
    equal = equal && (this.modified_by == null ? that.modified_by == null : this.modified_by.equals(that.modified_by));
    equal = equal && (this.modified_on == null ? that.modified_on == null : this.modified_on.equals(that.modified_on));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.station_code = JdbcWritableBridge.readString(1, __dbResults);
    this.stop_code = JdbcWritableBridge.readString(2, __dbResults);
    this.stop_name = JdbcWritableBridge.readString(3, __dbResults);
    this.short_stop_name = JdbcWritableBridge.readString(4, __dbResults);
    this.stop_type = JdbcWritableBridge.readString(5, __dbResults);
    this.status = JdbcWritableBridge.readString(6, __dbResults);
    this.arrival_trigger_distance = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.departure_trigger_distance = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.position = JdbcWritableBridge.readString(9, __dbResults);
    this.created_by = JdbcWritableBridge.readString(10, __dbResults);
    this.created_on = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.modified_by = JdbcWritableBridge.readString(12, __dbResults);
    this.modified_on = JdbcWritableBridge.readTimestamp(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.station_code = JdbcWritableBridge.readString(1, __dbResults);
    this.stop_code = JdbcWritableBridge.readString(2, __dbResults);
    this.stop_name = JdbcWritableBridge.readString(3, __dbResults);
    this.short_stop_name = JdbcWritableBridge.readString(4, __dbResults);
    this.stop_type = JdbcWritableBridge.readString(5, __dbResults);
    this.status = JdbcWritableBridge.readString(6, __dbResults);
    this.arrival_trigger_distance = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.departure_trigger_distance = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.position = JdbcWritableBridge.readString(9, __dbResults);
    this.created_by = JdbcWritableBridge.readString(10, __dbResults);
    this.created_on = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.modified_by = JdbcWritableBridge.readString(12, __dbResults);
    this.modified_on = JdbcWritableBridge.readTimestamp(13, __dbResults);
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
    JdbcWritableBridge.writeString(station_code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(stop_code, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(stop_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(short_stop_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(stop_type, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(arrival_trigger_distance, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(departure_trigger_distance, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(position, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(created_by, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_on, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(modified_by, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(modified_on, 13 + __off, 93, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(station_code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(stop_code, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(stop_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(short_stop_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(stop_type, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(arrival_trigger_distance, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(departure_trigger_distance, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(position, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(created_by, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_on, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(modified_by, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(modified_on, 13 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.station_code = null;
    } else {
    this.station_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.stop_code = null;
    } else {
    this.stop_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.stop_name = null;
    } else {
    this.stop_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.short_stop_name = null;
    } else {
    this.short_stop_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.stop_type = null;
    } else {
    this.stop_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.status = null;
    } else {
    this.status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.arrival_trigger_distance = null;
    } else {
    this.arrival_trigger_distance = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.departure_trigger_distance = null;
    } else {
    this.departure_trigger_distance = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.position = null;
    } else {
    this.position = Text.readString(__dataIn);
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
    if (null == this.station_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, station_code);
    }
    if (null == this.stop_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stop_code);
    }
    if (null == this.stop_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stop_name);
    }
    if (null == this.short_stop_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, short_stop_name);
    }
    if (null == this.stop_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stop_type);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
    if (null == this.arrival_trigger_distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.arrival_trigger_distance, __dataOut);
    }
    if (null == this.departure_trigger_distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.departure_trigger_distance, __dataOut);
    }
    if (null == this.position) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, position);
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
    if (null == this.station_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, station_code);
    }
    if (null == this.stop_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stop_code);
    }
    if (null == this.stop_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stop_name);
    }
    if (null == this.short_stop_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, short_stop_name);
    }
    if (null == this.stop_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stop_type);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
    if (null == this.arrival_trigger_distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.arrival_trigger_distance, __dataOut);
    }
    if (null == this.departure_trigger_distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.departure_trigger_distance, __dataOut);
    }
    if (null == this.position) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, position);
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
    __sb.append(FieldFormatter.escapeAndEnclose(station_code==null?"null":station_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stop_code==null?"null":stop_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stop_name==null?"null":stop_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(short_stop_name==null?"null":short_stop_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stop_type==null?"null":stop_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(arrival_trigger_distance==null?"null":arrival_trigger_distance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(departure_trigger_distance==null?"null":departure_trigger_distance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(position==null?"null":position, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(station_code==null?"null":station_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stop_code==null?"null":stop_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stop_name==null?"null":stop_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(short_stop_name==null?"null":short_stop_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stop_type==null?"null":stop_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(arrival_trigger_distance==null?"null":arrival_trigger_distance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(departure_trigger_distance==null?"null":departure_trigger_distance.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(position==null?"null":position, delimiters));
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
    if (__cur_str.equals("null")) { this.station_code = null; } else {
      this.station_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.stop_code = null; } else {
      this.stop_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.stop_name = null; } else {
      this.stop_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.short_stop_name = null; } else {
      this.short_stop_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.stop_type = null; } else {
      this.stop_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.arrival_trigger_distance = null; } else {
      this.arrival_trigger_distance = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.departure_trigger_distance = null; } else {
      this.departure_trigger_distance = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.position = null; } else {
      this.position = __cur_str;
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
    if (__cur_str.equals("null")) { this.station_code = null; } else {
      this.station_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.stop_code = null; } else {
      this.stop_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.stop_name = null; } else {
      this.stop_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.short_stop_name = null; } else {
      this.short_stop_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.stop_type = null; } else {
      this.stop_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.arrival_trigger_distance = null; } else {
      this.arrival_trigger_distance = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.departure_trigger_distance = null; } else {
      this.departure_trigger_distance = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.position = null; } else {
      this.position = __cur_str;
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
    stop o = (stop) super.clone();
    o.created_on = (o.created_on != null) ? (java.sql.Timestamp) o.created_on.clone() : null;
    o.modified_on = (o.modified_on != null) ? (java.sql.Timestamp) o.modified_on.clone() : null;
    return o;
  }

  public void clone0(stop o) throws CloneNotSupportedException {
    o.created_on = (o.created_on != null) ? (java.sql.Timestamp) o.created_on.clone() : null;
    o.modified_on = (o.modified_on != null) ? (java.sql.Timestamp) o.modified_on.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("station_code", this.station_code);
    __sqoop$field_map.put("stop_code", this.stop_code);
    __sqoop$field_map.put("stop_name", this.stop_name);
    __sqoop$field_map.put("short_stop_name", this.short_stop_name);
    __sqoop$field_map.put("stop_type", this.stop_type);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("arrival_trigger_distance", this.arrival_trigger_distance);
    __sqoop$field_map.put("departure_trigger_distance", this.departure_trigger_distance);
    __sqoop$field_map.put("position", this.position);
    __sqoop$field_map.put("created_by", this.created_by);
    __sqoop$field_map.put("created_on", this.created_on);
    __sqoop$field_map.put("modified_by", this.modified_by);
    __sqoop$field_map.put("modified_on", this.modified_on);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("station_code", this.station_code);
    __sqoop$field_map.put("stop_code", this.stop_code);
    __sqoop$field_map.put("stop_name", this.stop_name);
    __sqoop$field_map.put("short_stop_name", this.short_stop_name);
    __sqoop$field_map.put("stop_type", this.stop_type);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("arrival_trigger_distance", this.arrival_trigger_distance);
    __sqoop$field_map.put("departure_trigger_distance", this.departure_trigger_distance);
    __sqoop$field_map.put("position", this.position);
    __sqoop$field_map.put("created_by", this.created_by);
    __sqoop$field_map.put("created_on", this.created_on);
    __sqoop$field_map.put("modified_by", this.modified_by);
    __sqoop$field_map.put("modified_on", this.modified_on);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("station_code".equals(__fieldName)) {
      this.station_code = (String) __fieldVal;
    }
    else    if ("stop_code".equals(__fieldName)) {
      this.stop_code = (String) __fieldVal;
    }
    else    if ("stop_name".equals(__fieldName)) {
      this.stop_name = (String) __fieldVal;
    }
    else    if ("short_stop_name".equals(__fieldName)) {
      this.short_stop_name = (String) __fieldVal;
    }
    else    if ("stop_type".equals(__fieldName)) {
      this.stop_type = (String) __fieldVal;
    }
    else    if ("status".equals(__fieldName)) {
      this.status = (String) __fieldVal;
    }
    else    if ("arrival_trigger_distance".equals(__fieldName)) {
      this.arrival_trigger_distance = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("departure_trigger_distance".equals(__fieldName)) {
      this.departure_trigger_distance = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("position".equals(__fieldName)) {
      this.position = (String) __fieldVal;
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
    if ("station_code".equals(__fieldName)) {
      this.station_code = (String) __fieldVal;
      return true;
    }
    else    if ("stop_code".equals(__fieldName)) {
      this.stop_code = (String) __fieldVal;
      return true;
    }
    else    if ("stop_name".equals(__fieldName)) {
      this.stop_name = (String) __fieldVal;
      return true;
    }
    else    if ("short_stop_name".equals(__fieldName)) {
      this.short_stop_name = (String) __fieldVal;
      return true;
    }
    else    if ("stop_type".equals(__fieldName)) {
      this.stop_type = (String) __fieldVal;
      return true;
    }
    else    if ("status".equals(__fieldName)) {
      this.status = (String) __fieldVal;
      return true;
    }
    else    if ("arrival_trigger_distance".equals(__fieldName)) {
      this.arrival_trigger_distance = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("departure_trigger_distance".equals(__fieldName)) {
      this.departure_trigger_distance = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("position".equals(__fieldName)) {
      this.position = (String) __fieldVal;
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

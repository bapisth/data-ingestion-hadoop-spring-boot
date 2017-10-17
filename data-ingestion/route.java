// ORM class for table 'route'
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

public class route extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String route_code;
  public String get_route_code() {
    return route_code;
  }
  public void set_route_code(String route_code) {
    this.route_code = route_code;
  }
  public route with_route_code(String route_code) {
    this.route_code = route_code;
    return this;
  }
  private String route_type;
  public String get_route_type() {
    return route_type;
  }
  public void set_route_type(String route_type) {
    this.route_type = route_type;
  }
  public route with_route_type(String route_type) {
    this.route_type = route_type;
    return this;
  }
  private String line_code;
  public String get_line_code() {
    return line_code;
  }
  public void set_line_code(String line_code) {
    this.line_code = line_code;
  }
  public route with_line_code(String line_code) {
    this.line_code = line_code;
    return this;
  }
  private String route_name;
  public String get_route_name() {
    return route_name;
  }
  public void set_route_name(String route_name) {
    this.route_name = route_name;
  }
  public route with_route_name(String route_name) {
    this.route_name = route_name;
    return this;
  }
  private String route_destination;
  public String get_route_destination() {
    return route_destination;
  }
  public void set_route_destination(String route_destination) {
    this.route_destination = route_destination;
  }
  public route with_route_destination(String route_destination) {
    this.route_destination = route_destination;
    return this;
  }
  private String route_variant;
  public String get_route_variant() {
    return route_variant;
  }
  public void set_route_variant(String route_variant) {
    this.route_variant = route_variant;
  }
  public route with_route_variant(String route_variant) {
    this.route_variant = route_variant;
    return this;
  }
  private String route_flow;
  public String get_route_flow() {
    return route_flow;
  }
  public void set_route_flow(String route_flow) {
    this.route_flow = route_flow;
  }
  public route with_route_flow(String route_flow) {
    this.route_flow = route_flow;
    return this;
  }
  private String created_by;
  public String get_created_by() {
    return created_by;
  }
  public void set_created_by(String created_by) {
    this.created_by = created_by;
  }
  public route with_created_by(String created_by) {
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
  public route with_created_on(java.sql.Timestamp created_on) {
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
  public route with_modified_by(String modified_by) {
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
  public route with_modified_on(java.sql.Timestamp modified_on) {
    this.modified_on = modified_on;
    return this;
  }
  private String status;
  public String get_status() {
    return status;
  }
  public void set_status(String status) {
    this.status = status;
  }
  public route with_status(String status) {
    this.status = status;
    return this;
  }
  private String customer_route_code;
  public String get_customer_route_code() {
    return customer_route_code;
  }
  public void set_customer_route_code(String customer_route_code) {
    this.customer_route_code = customer_route_code;
  }
  public route with_customer_route_code(String customer_route_code) {
    this.customer_route_code = customer_route_code;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof route)) {
      return false;
    }
    route that = (route) o;
    boolean equal = true;
    equal = equal && (this.route_code == null ? that.route_code == null : this.route_code.equals(that.route_code));
    equal = equal && (this.route_type == null ? that.route_type == null : this.route_type.equals(that.route_type));
    equal = equal && (this.line_code == null ? that.line_code == null : this.line_code.equals(that.line_code));
    equal = equal && (this.route_name == null ? that.route_name == null : this.route_name.equals(that.route_name));
    equal = equal && (this.route_destination == null ? that.route_destination == null : this.route_destination.equals(that.route_destination));
    equal = equal && (this.route_variant == null ? that.route_variant == null : this.route_variant.equals(that.route_variant));
    equal = equal && (this.route_flow == null ? that.route_flow == null : this.route_flow.equals(that.route_flow));
    equal = equal && (this.created_by == null ? that.created_by == null : this.created_by.equals(that.created_by));
    equal = equal && (this.created_on == null ? that.created_on == null : this.created_on.equals(that.created_on));
    equal = equal && (this.modified_by == null ? that.modified_by == null : this.modified_by.equals(that.modified_by));
    equal = equal && (this.modified_on == null ? that.modified_on == null : this.modified_on.equals(that.modified_on));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.customer_route_code == null ? that.customer_route_code == null : this.customer_route_code.equals(that.customer_route_code));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof route)) {
      return false;
    }
    route that = (route) o;
    boolean equal = true;
    equal = equal && (this.route_code == null ? that.route_code == null : this.route_code.equals(that.route_code));
    equal = equal && (this.route_type == null ? that.route_type == null : this.route_type.equals(that.route_type));
    equal = equal && (this.line_code == null ? that.line_code == null : this.line_code.equals(that.line_code));
    equal = equal && (this.route_name == null ? that.route_name == null : this.route_name.equals(that.route_name));
    equal = equal && (this.route_destination == null ? that.route_destination == null : this.route_destination.equals(that.route_destination));
    equal = equal && (this.route_variant == null ? that.route_variant == null : this.route_variant.equals(that.route_variant));
    equal = equal && (this.route_flow == null ? that.route_flow == null : this.route_flow.equals(that.route_flow));
    equal = equal && (this.created_by == null ? that.created_by == null : this.created_by.equals(that.created_by));
    equal = equal && (this.created_on == null ? that.created_on == null : this.created_on.equals(that.created_on));
    equal = equal && (this.modified_by == null ? that.modified_by == null : this.modified_by.equals(that.modified_by));
    equal = equal && (this.modified_on == null ? that.modified_on == null : this.modified_on.equals(that.modified_on));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.customer_route_code == null ? that.customer_route_code == null : this.customer_route_code.equals(that.customer_route_code));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.route_code = JdbcWritableBridge.readString(1, __dbResults);
    this.route_type = JdbcWritableBridge.readString(2, __dbResults);
    this.line_code = JdbcWritableBridge.readString(3, __dbResults);
    this.route_name = JdbcWritableBridge.readString(4, __dbResults);
    this.route_destination = JdbcWritableBridge.readString(5, __dbResults);
    this.route_variant = JdbcWritableBridge.readString(6, __dbResults);
    this.route_flow = JdbcWritableBridge.readString(7, __dbResults);
    this.created_by = JdbcWritableBridge.readString(8, __dbResults);
    this.created_on = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.modified_by = JdbcWritableBridge.readString(10, __dbResults);
    this.modified_on = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.status = JdbcWritableBridge.readString(12, __dbResults);
    this.customer_route_code = JdbcWritableBridge.readString(13, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.route_code = JdbcWritableBridge.readString(1, __dbResults);
    this.route_type = JdbcWritableBridge.readString(2, __dbResults);
    this.line_code = JdbcWritableBridge.readString(3, __dbResults);
    this.route_name = JdbcWritableBridge.readString(4, __dbResults);
    this.route_destination = JdbcWritableBridge.readString(5, __dbResults);
    this.route_variant = JdbcWritableBridge.readString(6, __dbResults);
    this.route_flow = JdbcWritableBridge.readString(7, __dbResults);
    this.created_by = JdbcWritableBridge.readString(8, __dbResults);
    this.created_on = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.modified_by = JdbcWritableBridge.readString(10, __dbResults);
    this.modified_on = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.status = JdbcWritableBridge.readString(12, __dbResults);
    this.customer_route_code = JdbcWritableBridge.readString(13, __dbResults);
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
    JdbcWritableBridge.writeString(route_code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(route_type, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(line_code, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(route_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(route_destination, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(route_variant, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(route_flow, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(created_by, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_on, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(modified_by, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(modified_on, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(status, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_route_code, 13 + __off, 12, __dbStmt);
    return 13;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(route_code, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(route_type, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(line_code, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(route_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(route_destination, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(route_variant, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(route_flow, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(created_by, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_on, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(modified_by, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(modified_on, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(status, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_route_code, 13 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.route_code = null;
    } else {
    this.route_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.route_type = null;
    } else {
    this.route_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.line_code = null;
    } else {
    this.line_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.route_name = null;
    } else {
    this.route_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.route_destination = null;
    } else {
    this.route_destination = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.route_variant = null;
    } else {
    this.route_variant = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.route_flow = null;
    } else {
    this.route_flow = Text.readString(__dataIn);
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
    if (__dataIn.readBoolean()) { 
        this.status = null;
    } else {
    this.status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_route_code = null;
    } else {
    this.customer_route_code = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.route_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, route_code);
    }
    if (null == this.route_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, route_type);
    }
    if (null == this.line_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, line_code);
    }
    if (null == this.route_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, route_name);
    }
    if (null == this.route_destination) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, route_destination);
    }
    if (null == this.route_variant) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, route_variant);
    }
    if (null == this.route_flow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, route_flow);
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
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
    if (null == this.customer_route_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_route_code);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.route_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, route_code);
    }
    if (null == this.route_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, route_type);
    }
    if (null == this.line_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, line_code);
    }
    if (null == this.route_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, route_name);
    }
    if (null == this.route_destination) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, route_destination);
    }
    if (null == this.route_variant) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, route_variant);
    }
    if (null == this.route_flow) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, route_flow);
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
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
    if (null == this.customer_route_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_route_code);
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
    __sb.append(FieldFormatter.escapeAndEnclose(route_code==null?"null":route_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(route_type==null?"null":route_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(line_code==null?"null":line_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(route_name==null?"null":route_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(route_destination==null?"null":route_destination, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(route_variant==null?"null":route_variant, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(route_flow==null?"null":route_flow, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_by==null?"null":created_by, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_on==null?"null":"" + created_on, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modified_by==null?"null":modified_by, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modified_on==null?"null":"" + modified_on, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_route_code==null?"null":customer_route_code, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(route_code==null?"null":route_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(route_type==null?"null":route_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(line_code==null?"null":line_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(route_name==null?"null":route_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(route_destination==null?"null":route_destination, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(route_variant==null?"null":route_variant, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(route_flow==null?"null":route_flow, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_by==null?"null":created_by, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_on==null?"null":"" + created_on, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modified_by==null?"null":modified_by, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modified_on==null?"null":"" + modified_on, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_route_code==null?"null":customer_route_code, delimiters));
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
    if (__cur_str.equals("null")) { this.route_code = null; } else {
      this.route_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.route_type = null; } else {
      this.route_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.line_code = null; } else {
      this.line_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.route_name = null; } else {
      this.route_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.route_destination = null; } else {
      this.route_destination = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.route_variant = null; } else {
      this.route_variant = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.route_flow = null; } else {
      this.route_flow = __cur_str;
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

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_route_code = null; } else {
      this.customer_route_code = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.route_code = null; } else {
      this.route_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.route_type = null; } else {
      this.route_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.line_code = null; } else {
      this.line_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.route_name = null; } else {
      this.route_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.route_destination = null; } else {
      this.route_destination = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.route_variant = null; } else {
      this.route_variant = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.route_flow = null; } else {
      this.route_flow = __cur_str;
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

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_route_code = null; } else {
      this.customer_route_code = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    route o = (route) super.clone();
    o.created_on = (o.created_on != null) ? (java.sql.Timestamp) o.created_on.clone() : null;
    o.modified_on = (o.modified_on != null) ? (java.sql.Timestamp) o.modified_on.clone() : null;
    return o;
  }

  public void clone0(route o) throws CloneNotSupportedException {
    o.created_on = (o.created_on != null) ? (java.sql.Timestamp) o.created_on.clone() : null;
    o.modified_on = (o.modified_on != null) ? (java.sql.Timestamp) o.modified_on.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("route_code", this.route_code);
    __sqoop$field_map.put("route_type", this.route_type);
    __sqoop$field_map.put("line_code", this.line_code);
    __sqoop$field_map.put("route_name", this.route_name);
    __sqoop$field_map.put("route_destination", this.route_destination);
    __sqoop$field_map.put("route_variant", this.route_variant);
    __sqoop$field_map.put("route_flow", this.route_flow);
    __sqoop$field_map.put("created_by", this.created_by);
    __sqoop$field_map.put("created_on", this.created_on);
    __sqoop$field_map.put("modified_by", this.modified_by);
    __sqoop$field_map.put("modified_on", this.modified_on);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("customer_route_code", this.customer_route_code);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("route_code", this.route_code);
    __sqoop$field_map.put("route_type", this.route_type);
    __sqoop$field_map.put("line_code", this.line_code);
    __sqoop$field_map.put("route_name", this.route_name);
    __sqoop$field_map.put("route_destination", this.route_destination);
    __sqoop$field_map.put("route_variant", this.route_variant);
    __sqoop$field_map.put("route_flow", this.route_flow);
    __sqoop$field_map.put("created_by", this.created_by);
    __sqoop$field_map.put("created_on", this.created_on);
    __sqoop$field_map.put("modified_by", this.modified_by);
    __sqoop$field_map.put("modified_on", this.modified_on);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("customer_route_code", this.customer_route_code);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("route_code".equals(__fieldName)) {
      this.route_code = (String) __fieldVal;
    }
    else    if ("route_type".equals(__fieldName)) {
      this.route_type = (String) __fieldVal;
    }
    else    if ("line_code".equals(__fieldName)) {
      this.line_code = (String) __fieldVal;
    }
    else    if ("route_name".equals(__fieldName)) {
      this.route_name = (String) __fieldVal;
    }
    else    if ("route_destination".equals(__fieldName)) {
      this.route_destination = (String) __fieldVal;
    }
    else    if ("route_variant".equals(__fieldName)) {
      this.route_variant = (String) __fieldVal;
    }
    else    if ("route_flow".equals(__fieldName)) {
      this.route_flow = (String) __fieldVal;
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
    else    if ("status".equals(__fieldName)) {
      this.status = (String) __fieldVal;
    }
    else    if ("customer_route_code".equals(__fieldName)) {
      this.customer_route_code = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("route_code".equals(__fieldName)) {
      this.route_code = (String) __fieldVal;
      return true;
    }
    else    if ("route_type".equals(__fieldName)) {
      this.route_type = (String) __fieldVal;
      return true;
    }
    else    if ("line_code".equals(__fieldName)) {
      this.line_code = (String) __fieldVal;
      return true;
    }
    else    if ("route_name".equals(__fieldName)) {
      this.route_name = (String) __fieldVal;
      return true;
    }
    else    if ("route_destination".equals(__fieldName)) {
      this.route_destination = (String) __fieldVal;
      return true;
    }
    else    if ("route_variant".equals(__fieldName)) {
      this.route_variant = (String) __fieldVal;
      return true;
    }
    else    if ("route_flow".equals(__fieldName)) {
      this.route_flow = (String) __fieldVal;
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
    else    if ("status".equals(__fieldName)) {
      this.status = (String) __fieldVal;
      return true;
    }
    else    if ("customer_route_code".equals(__fieldName)) {
      this.customer_route_code = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

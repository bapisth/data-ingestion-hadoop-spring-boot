// ORM class for table 'api_log'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Oct 17 15:46:52 IST 2017
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

public class api_log extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Long log_id;
  public Long get_log_id() {
    return log_id;
  }
  public void set_log_id(Long log_id) {
    this.log_id = log_id;
  }
  public api_log with_log_id(Long log_id) {
    this.log_id = log_id;
    return this;
  }
  private String request_content;
  public String get_request_content() {
    return request_content;
  }
  public void set_request_content(String request_content) {
    this.request_content = request_content;
  }
  public api_log with_request_content(String request_content) {
    this.request_content = request_content;
    return this;
  }
  private String response_content;
  public String get_response_content() {
    return response_content;
  }
  public void set_response_content(String response_content) {
    this.response_content = response_content;
  }
  public api_log with_response_content(String response_content) {
    this.response_content = response_content;
    return this;
  }
  private String caller_ip;
  public String get_caller_ip() {
    return caller_ip;
  }
  public void set_caller_ip(String caller_ip) {
    this.caller_ip = caller_ip;
  }
  public api_log with_caller_ip(String caller_ip) {
    this.caller_ip = caller_ip;
    return this;
  }
  private String api_url;
  public String get_api_url() {
    return api_url;
  }
  public void set_api_url(String api_url) {
    this.api_url = api_url;
  }
  public api_log with_api_url(String api_url) {
    this.api_url = api_url;
    return this;
  }
  private String requested_user;
  public String get_requested_user() {
    return requested_user;
  }
  public void set_requested_user(String requested_user) {
    this.requested_user = requested_user;
  }
  public api_log with_requested_user(String requested_user) {
    this.requested_user = requested_user;
    return this;
  }
  private String request_status;
  public String get_request_status() {
    return request_status;
  }
  public void set_request_status(String request_status) {
    this.request_status = request_status;
  }
  public api_log with_request_status(String request_status) {
    this.request_status = request_status;
    return this;
  }
  private Integer retry_count;
  public Integer get_retry_count() {
    return retry_count;
  }
  public void set_retry_count(Integer retry_count) {
    this.retry_count = retry_count;
  }
  public api_log with_retry_count(Integer retry_count) {
    this.retry_count = retry_count;
    return this;
  }
  private String retry_request;
  public String get_retry_request() {
    return retry_request;
  }
  public void set_retry_request(String retry_request) {
    this.retry_request = retry_request;
  }
  public api_log with_retry_request(String retry_request) {
    this.retry_request = retry_request;
    return this;
  }
  private java.sql.Timestamp request_time;
  public java.sql.Timestamp get_request_time() {
    return request_time;
  }
  public void set_request_time(java.sql.Timestamp request_time) {
    this.request_time = request_time;
  }
  public api_log with_request_time(java.sql.Timestamp request_time) {
    this.request_time = request_time;
    return this;
  }
  private String direction;
  public String get_direction() {
    return direction;
  }
  public void set_direction(String direction) {
    this.direction = direction;
  }
  public api_log with_direction(String direction) {
    this.direction = direction;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof api_log)) {
      return false;
    }
    api_log that = (api_log) o;
    boolean equal = true;
    equal = equal && (this.log_id == null ? that.log_id == null : this.log_id.equals(that.log_id));
    equal = equal && (this.request_content == null ? that.request_content == null : this.request_content.equals(that.request_content));
    equal = equal && (this.response_content == null ? that.response_content == null : this.response_content.equals(that.response_content));
    equal = equal && (this.caller_ip == null ? that.caller_ip == null : this.caller_ip.equals(that.caller_ip));
    equal = equal && (this.api_url == null ? that.api_url == null : this.api_url.equals(that.api_url));
    equal = equal && (this.requested_user == null ? that.requested_user == null : this.requested_user.equals(that.requested_user));
    equal = equal && (this.request_status == null ? that.request_status == null : this.request_status.equals(that.request_status));
    equal = equal && (this.retry_count == null ? that.retry_count == null : this.retry_count.equals(that.retry_count));
    equal = equal && (this.retry_request == null ? that.retry_request == null : this.retry_request.equals(that.retry_request));
    equal = equal && (this.request_time == null ? that.request_time == null : this.request_time.equals(that.request_time));
    equal = equal && (this.direction == null ? that.direction == null : this.direction.equals(that.direction));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof api_log)) {
      return false;
    }
    api_log that = (api_log) o;
    boolean equal = true;
    equal = equal && (this.log_id == null ? that.log_id == null : this.log_id.equals(that.log_id));
    equal = equal && (this.request_content == null ? that.request_content == null : this.request_content.equals(that.request_content));
    equal = equal && (this.response_content == null ? that.response_content == null : this.response_content.equals(that.response_content));
    equal = equal && (this.caller_ip == null ? that.caller_ip == null : this.caller_ip.equals(that.caller_ip));
    equal = equal && (this.api_url == null ? that.api_url == null : this.api_url.equals(that.api_url));
    equal = equal && (this.requested_user == null ? that.requested_user == null : this.requested_user.equals(that.requested_user));
    equal = equal && (this.request_status == null ? that.request_status == null : this.request_status.equals(that.request_status));
    equal = equal && (this.retry_count == null ? that.retry_count == null : this.retry_count.equals(that.retry_count));
    equal = equal && (this.retry_request == null ? that.retry_request == null : this.retry_request.equals(that.retry_request));
    equal = equal && (this.request_time == null ? that.request_time == null : this.request_time.equals(that.request_time));
    equal = equal && (this.direction == null ? that.direction == null : this.direction.equals(that.direction));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.log_id = JdbcWritableBridge.readLong(1, __dbResults);
    this.request_content = JdbcWritableBridge.readString(2, __dbResults);
    this.response_content = JdbcWritableBridge.readString(3, __dbResults);
    this.caller_ip = JdbcWritableBridge.readString(4, __dbResults);
    this.api_url = JdbcWritableBridge.readString(5, __dbResults);
    this.requested_user = JdbcWritableBridge.readString(6, __dbResults);
    this.request_status = JdbcWritableBridge.readString(7, __dbResults);
    this.retry_count = JdbcWritableBridge.readInteger(8, __dbResults);
    this.retry_request = JdbcWritableBridge.readString(9, __dbResults);
    this.request_time = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.direction = JdbcWritableBridge.readString(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.log_id = JdbcWritableBridge.readLong(1, __dbResults);
    this.request_content = JdbcWritableBridge.readString(2, __dbResults);
    this.response_content = JdbcWritableBridge.readString(3, __dbResults);
    this.caller_ip = JdbcWritableBridge.readString(4, __dbResults);
    this.api_url = JdbcWritableBridge.readString(5, __dbResults);
    this.requested_user = JdbcWritableBridge.readString(6, __dbResults);
    this.request_status = JdbcWritableBridge.readString(7, __dbResults);
    this.retry_count = JdbcWritableBridge.readInteger(8, __dbResults);
    this.retry_request = JdbcWritableBridge.readString(9, __dbResults);
    this.request_time = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.direction = JdbcWritableBridge.readString(11, __dbResults);
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
    JdbcWritableBridge.writeLong(log_id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(request_content, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(response_content, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(caller_ip, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(api_url, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(requested_user, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(request_status, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(retry_count, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(retry_request, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(request_time, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(direction, 11 + __off, 12, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(log_id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(request_content, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(response_content, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(caller_ip, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(api_url, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(requested_user, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(request_status, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(retry_count, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(retry_request, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(request_time, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(direction, 11 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.log_id = null;
    } else {
    this.log_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.request_content = null;
    } else {
    this.request_content = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.response_content = null;
    } else {
    this.response_content = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.caller_ip = null;
    } else {
    this.caller_ip = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.api_url = null;
    } else {
    this.api_url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.requested_user = null;
    } else {
    this.requested_user = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.request_status = null;
    } else {
    this.request_status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.retry_count = null;
    } else {
    this.retry_count = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.retry_request = null;
    } else {
    this.retry_request = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.request_time = null;
    } else {
    this.request_time = new Timestamp(__dataIn.readLong());
    this.request_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.direction = null;
    } else {
    this.direction = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.log_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.log_id);
    }
    if (null == this.request_content) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, request_content);
    }
    if (null == this.response_content) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, response_content);
    }
    if (null == this.caller_ip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, caller_ip);
    }
    if (null == this.api_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, api_url);
    }
    if (null == this.requested_user) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, requested_user);
    }
    if (null == this.request_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, request_status);
    }
    if (null == this.retry_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.retry_count);
    }
    if (null == this.retry_request) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, retry_request);
    }
    if (null == this.request_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.request_time.getTime());
    __dataOut.writeInt(this.request_time.getNanos());
    }
    if (null == this.direction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, direction);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.log_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.log_id);
    }
    if (null == this.request_content) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, request_content);
    }
    if (null == this.response_content) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, response_content);
    }
    if (null == this.caller_ip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, caller_ip);
    }
    if (null == this.api_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, api_url);
    }
    if (null == this.requested_user) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, requested_user);
    }
    if (null == this.request_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, request_status);
    }
    if (null == this.retry_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.retry_count);
    }
    if (null == this.retry_request) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, retry_request);
    }
    if (null == this.request_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.request_time.getTime());
    __dataOut.writeInt(this.request_time.getNanos());
    }
    if (null == this.direction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, direction);
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
    __sb.append(FieldFormatter.escapeAndEnclose(log_id==null?"null":"" + log_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(request_content==null?"null":request_content, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(response_content==null?"null":response_content, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(caller_ip==null?"null":caller_ip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(api_url==null?"null":api_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(requested_user==null?"null":requested_user, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(request_status==null?"null":request_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(retry_count==null?"null":"" + retry_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(retry_request==null?"null":retry_request, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(request_time==null?"null":"" + request_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(direction==null?"null":direction, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(log_id==null?"null":"" + log_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(request_content==null?"null":request_content, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(response_content==null?"null":response_content, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(caller_ip==null?"null":caller_ip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(api_url==null?"null":api_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(requested_user==null?"null":requested_user, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(request_status==null?"null":request_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(retry_count==null?"null":"" + retry_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(retry_request==null?"null":retry_request, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(request_time==null?"null":"" + request_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(direction==null?"null":direction, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.log_id = null; } else {
      this.log_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.request_content = null; } else {
      this.request_content = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.response_content = null; } else {
      this.response_content = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.caller_ip = null; } else {
      this.caller_ip = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.api_url = null; } else {
      this.api_url = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.requested_user = null; } else {
      this.requested_user = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.request_status = null; } else {
      this.request_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.retry_count = null; } else {
      this.retry_count = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.retry_request = null; } else {
      this.retry_request = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.request_time = null; } else {
      this.request_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.direction = null; } else {
      this.direction = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.log_id = null; } else {
      this.log_id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.request_content = null; } else {
      this.request_content = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.response_content = null; } else {
      this.response_content = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.caller_ip = null; } else {
      this.caller_ip = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.api_url = null; } else {
      this.api_url = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.requested_user = null; } else {
      this.requested_user = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.request_status = null; } else {
      this.request_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.retry_count = null; } else {
      this.retry_count = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.retry_request = null; } else {
      this.retry_request = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.request_time = null; } else {
      this.request_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.direction = null; } else {
      this.direction = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    api_log o = (api_log) super.clone();
    o.request_time = (o.request_time != null) ? (java.sql.Timestamp) o.request_time.clone() : null;
    return o;
  }

  public void clone0(api_log o) throws CloneNotSupportedException {
    o.request_time = (o.request_time != null) ? (java.sql.Timestamp) o.request_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("log_id", this.log_id);
    __sqoop$field_map.put("request_content", this.request_content);
    __sqoop$field_map.put("response_content", this.response_content);
    __sqoop$field_map.put("caller_ip", this.caller_ip);
    __sqoop$field_map.put("api_url", this.api_url);
    __sqoop$field_map.put("requested_user", this.requested_user);
    __sqoop$field_map.put("request_status", this.request_status);
    __sqoop$field_map.put("retry_count", this.retry_count);
    __sqoop$field_map.put("retry_request", this.retry_request);
    __sqoop$field_map.put("request_time", this.request_time);
    __sqoop$field_map.put("direction", this.direction);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("log_id", this.log_id);
    __sqoop$field_map.put("request_content", this.request_content);
    __sqoop$field_map.put("response_content", this.response_content);
    __sqoop$field_map.put("caller_ip", this.caller_ip);
    __sqoop$field_map.put("api_url", this.api_url);
    __sqoop$field_map.put("requested_user", this.requested_user);
    __sqoop$field_map.put("request_status", this.request_status);
    __sqoop$field_map.put("retry_count", this.retry_count);
    __sqoop$field_map.put("retry_request", this.retry_request);
    __sqoop$field_map.put("request_time", this.request_time);
    __sqoop$field_map.put("direction", this.direction);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("log_id".equals(__fieldName)) {
      this.log_id = (Long) __fieldVal;
    }
    else    if ("request_content".equals(__fieldName)) {
      this.request_content = (String) __fieldVal;
    }
    else    if ("response_content".equals(__fieldName)) {
      this.response_content = (String) __fieldVal;
    }
    else    if ("caller_ip".equals(__fieldName)) {
      this.caller_ip = (String) __fieldVal;
    }
    else    if ("api_url".equals(__fieldName)) {
      this.api_url = (String) __fieldVal;
    }
    else    if ("requested_user".equals(__fieldName)) {
      this.requested_user = (String) __fieldVal;
    }
    else    if ("request_status".equals(__fieldName)) {
      this.request_status = (String) __fieldVal;
    }
    else    if ("retry_count".equals(__fieldName)) {
      this.retry_count = (Integer) __fieldVal;
    }
    else    if ("retry_request".equals(__fieldName)) {
      this.retry_request = (String) __fieldVal;
    }
    else    if ("request_time".equals(__fieldName)) {
      this.request_time = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("direction".equals(__fieldName)) {
      this.direction = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("log_id".equals(__fieldName)) {
      this.log_id = (Long) __fieldVal;
      return true;
    }
    else    if ("request_content".equals(__fieldName)) {
      this.request_content = (String) __fieldVal;
      return true;
    }
    else    if ("response_content".equals(__fieldName)) {
      this.response_content = (String) __fieldVal;
      return true;
    }
    else    if ("caller_ip".equals(__fieldName)) {
      this.caller_ip = (String) __fieldVal;
      return true;
    }
    else    if ("api_url".equals(__fieldName)) {
      this.api_url = (String) __fieldVal;
      return true;
    }
    else    if ("requested_user".equals(__fieldName)) {
      this.requested_user = (String) __fieldVal;
      return true;
    }
    else    if ("request_status".equals(__fieldName)) {
      this.request_status = (String) __fieldVal;
      return true;
    }
    else    if ("retry_count".equals(__fieldName)) {
      this.retry_count = (Integer) __fieldVal;
      return true;
    }
    else    if ("retry_request".equals(__fieldName)) {
      this.retry_request = (String) __fieldVal;
      return true;
    }
    else    if ("request_time".equals(__fieldName)) {
      this.request_time = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("direction".equals(__fieldName)) {
      this.direction = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

// ORM class for table 'mdm_notification'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Oct 17 20:25:17 IST 2017
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

public class mdm_notification extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Long id;
  public Long get_id() {
    return id;
  }
  public void set_id(Long id) {
    this.id = id;
  }
  public mdm_notification with_id(Long id) {
    this.id = id;
    return this;
  }
  private String sms_group;
  public String get_sms_group() {
    return sms_group;
  }
  public void set_sms_group(String sms_group) {
    this.sms_group = sms_group;
  }
  public mdm_notification with_sms_group(String sms_group) {
    this.sms_group = sms_group;
    return this;
  }
  private String notification_type;
  public String get_notification_type() {
    return notification_type;
  }
  public void set_notification_type(String notification_type) {
    this.notification_type = notification_type;
  }
  public mdm_notification with_notification_type(String notification_type) {
    this.notification_type = notification_type;
    return this;
  }
  private String group_details;
  public String get_group_details() {
    return group_details;
  }
  public void set_group_details(String group_details) {
    this.group_details = group_details;
  }
  public mdm_notification with_group_details(String group_details) {
    this.group_details = group_details;
    return this;
  }
  private String tenant_id;
  public String get_tenant_id() {
    return tenant_id;
  }
  public void set_tenant_id(String tenant_id) {
    this.tenant_id = tenant_id;
  }
  public mdm_notification with_tenant_id(String tenant_id) {
    this.tenant_id = tenant_id;
    return this;
  }
  private String status;
  public String get_status() {
    return status;
  }
  public void set_status(String status) {
    this.status = status;
  }
  public mdm_notification with_status(String status) {
    this.status = status;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof mdm_notification)) {
      return false;
    }
    mdm_notification that = (mdm_notification) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.sms_group == null ? that.sms_group == null : this.sms_group.equals(that.sms_group));
    equal = equal && (this.notification_type == null ? that.notification_type == null : this.notification_type.equals(that.notification_type));
    equal = equal && (this.group_details == null ? that.group_details == null : this.group_details.equals(that.group_details));
    equal = equal && (this.tenant_id == null ? that.tenant_id == null : this.tenant_id.equals(that.tenant_id));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof mdm_notification)) {
      return false;
    }
    mdm_notification that = (mdm_notification) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.sms_group == null ? that.sms_group == null : this.sms_group.equals(that.sms_group));
    equal = equal && (this.notification_type == null ? that.notification_type == null : this.notification_type.equals(that.notification_type));
    equal = equal && (this.group_details == null ? that.group_details == null : this.group_details.equals(that.group_details));
    equal = equal && (this.tenant_id == null ? that.tenant_id == null : this.tenant_id.equals(that.tenant_id));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.sms_group = JdbcWritableBridge.readString(2, __dbResults);
    this.notification_type = JdbcWritableBridge.readString(3, __dbResults);
    this.group_details = JdbcWritableBridge.readString(4, __dbResults);
    this.tenant_id = JdbcWritableBridge.readString(5, __dbResults);
    this.status = JdbcWritableBridge.readString(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.sms_group = JdbcWritableBridge.readString(2, __dbResults);
    this.notification_type = JdbcWritableBridge.readString(3, __dbResults);
    this.group_details = JdbcWritableBridge.readString(4, __dbResults);
    this.tenant_id = JdbcWritableBridge.readString(5, __dbResults);
    this.status = JdbcWritableBridge.readString(6, __dbResults);
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
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(sms_group, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(notification_type, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(group_details, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tenant_id, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 6 + __off, 12, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(sms_group, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(notification_type, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(group_details, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tenant_id, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 6 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.sms_group = null;
    } else {
    this.sms_group = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.notification_type = null;
    } else {
    this.notification_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.group_details = null;
    } else {
    this.group_details = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tenant_id = null;
    } else {
    this.tenant_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.status = null;
    } else {
    this.status = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.sms_group) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sms_group);
    }
    if (null == this.notification_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, notification_type);
    }
    if (null == this.group_details) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, group_details);
    }
    if (null == this.tenant_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tenant_id);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.sms_group) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sms_group);
    }
    if (null == this.notification_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, notification_type);
    }
    if (null == this.group_details) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, group_details);
    }
    if (null == this.tenant_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tenant_id);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
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
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sms_group==null?"null":sms_group, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(notification_type==null?"null":notification_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(group_details==null?"null":group_details, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tenant_id==null?"null":tenant_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sms_group==null?"null":sms_group, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(notification_type==null?"null":notification_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(group_details==null?"null":group_details, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tenant_id==null?"null":tenant_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sms_group = null; } else {
      this.sms_group = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.notification_type = null; } else {
      this.notification_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.group_details = null; } else {
      this.group_details = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tenant_id = null; } else {
      this.tenant_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sms_group = null; } else {
      this.sms_group = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.notification_type = null; } else {
      this.notification_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.group_details = null; } else {
      this.group_details = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tenant_id = null; } else {
      this.tenant_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    mdm_notification o = (mdm_notification) super.clone();
    return o;
  }

  public void clone0(mdm_notification o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("sms_group", this.sms_group);
    __sqoop$field_map.put("notification_type", this.notification_type);
    __sqoop$field_map.put("group_details", this.group_details);
    __sqoop$field_map.put("tenant_id", this.tenant_id);
    __sqoop$field_map.put("status", this.status);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("sms_group", this.sms_group);
    __sqoop$field_map.put("notification_type", this.notification_type);
    __sqoop$field_map.put("group_details", this.group_details);
    __sqoop$field_map.put("tenant_id", this.tenant_id);
    __sqoop$field_map.put("status", this.status);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Long) __fieldVal;
    }
    else    if ("sms_group".equals(__fieldName)) {
      this.sms_group = (String) __fieldVal;
    }
    else    if ("notification_type".equals(__fieldName)) {
      this.notification_type = (String) __fieldVal;
    }
    else    if ("group_details".equals(__fieldName)) {
      this.group_details = (String) __fieldVal;
    }
    else    if ("tenant_id".equals(__fieldName)) {
      this.tenant_id = (String) __fieldVal;
    }
    else    if ("status".equals(__fieldName)) {
      this.status = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("id".equals(__fieldName)) {
      this.id = (Long) __fieldVal;
      return true;
    }
    else    if ("sms_group".equals(__fieldName)) {
      this.sms_group = (String) __fieldVal;
      return true;
    }
    else    if ("notification_type".equals(__fieldName)) {
      this.notification_type = (String) __fieldVal;
      return true;
    }
    else    if ("group_details".equals(__fieldName)) {
      this.group_details = (String) __fieldVal;
      return true;
    }
    else    if ("tenant_id".equals(__fieldName)) {
      this.tenant_id = (String) __fieldVal;
      return true;
    }
    else    if ("status".equals(__fieldName)) {
      this.status = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

// ORM class for table 'mdm_ims_employee'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Oct 16 18:49:54 IST 2017
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

public class mdm_ims_employee extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String employee_id;
  public String get_employee_id() {
    return employee_id;
  }
  public void set_employee_id(String employee_id) {
    this.employee_id = employee_id;
  }
  public mdm_ims_employee with_employee_id(String employee_id) {
    this.employee_id = employee_id;
    return this;
  }
  private String employee_name;
  public String get_employee_name() {
    return employee_name;
  }
  public void set_employee_name(String employee_name) {
    this.employee_name = employee_name;
  }
  public mdm_ims_employee with_employee_name(String employee_name) {
    this.employee_name = employee_name;
    return this;
  }
  private String agency;
  public String get_agency() {
    return agency;
  }
  public void set_agency(String agency) {
    this.agency = agency;
  }
  public mdm_ims_employee with_agency(String agency) {
    this.agency = agency;
    return this;
  }
  private String tenant_id;
  public String get_tenant_id() {
    return tenant_id;
  }
  public void set_tenant_id(String tenant_id) {
    this.tenant_id = tenant_id;
  }
  public mdm_ims_employee with_tenant_id(String tenant_id) {
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
  public mdm_ims_employee with_status(String status) {
    this.status = status;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof mdm_ims_employee)) {
      return false;
    }
    mdm_ims_employee that = (mdm_ims_employee) o;
    boolean equal = true;
    equal = equal && (this.employee_id == null ? that.employee_id == null : this.employee_id.equals(that.employee_id));
    equal = equal && (this.employee_name == null ? that.employee_name == null : this.employee_name.equals(that.employee_name));
    equal = equal && (this.agency == null ? that.agency == null : this.agency.equals(that.agency));
    equal = equal && (this.tenant_id == null ? that.tenant_id == null : this.tenant_id.equals(that.tenant_id));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof mdm_ims_employee)) {
      return false;
    }
    mdm_ims_employee that = (mdm_ims_employee) o;
    boolean equal = true;
    equal = equal && (this.employee_id == null ? that.employee_id == null : this.employee_id.equals(that.employee_id));
    equal = equal && (this.employee_name == null ? that.employee_name == null : this.employee_name.equals(that.employee_name));
    equal = equal && (this.agency == null ? that.agency == null : this.agency.equals(that.agency));
    equal = equal && (this.tenant_id == null ? that.tenant_id == null : this.tenant_id.equals(that.tenant_id));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.employee_id = JdbcWritableBridge.readString(1, __dbResults);
    this.employee_name = JdbcWritableBridge.readString(2, __dbResults);
    this.agency = JdbcWritableBridge.readString(3, __dbResults);
    this.tenant_id = JdbcWritableBridge.readString(4, __dbResults);
    this.status = JdbcWritableBridge.readString(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.employee_id = JdbcWritableBridge.readString(1, __dbResults);
    this.employee_name = JdbcWritableBridge.readString(2, __dbResults);
    this.agency = JdbcWritableBridge.readString(3, __dbResults);
    this.tenant_id = JdbcWritableBridge.readString(4, __dbResults);
    this.status = JdbcWritableBridge.readString(5, __dbResults);
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
    JdbcWritableBridge.writeString(employee_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(employee_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(agency, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tenant_id, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 5 + __off, 12, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(employee_id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(employee_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(agency, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tenant_id, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 5 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.employee_id = null;
    } else {
    this.employee_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.employee_name = null;
    } else {
    this.employee_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.agency = null;
    } else {
    this.agency = Text.readString(__dataIn);
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
    if (null == this.employee_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, employee_id);
    }
    if (null == this.employee_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, employee_name);
    }
    if (null == this.agency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, agency);
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
    if (null == this.employee_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, employee_id);
    }
    if (null == this.employee_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, employee_name);
    }
    if (null == this.agency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, agency);
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
    __sb.append(FieldFormatter.escapeAndEnclose(employee_id==null?"null":employee_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(employee_name==null?"null":employee_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(agency==null?"null":agency, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(employee_id==null?"null":employee_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(employee_name==null?"null":employee_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(agency==null?"null":agency, delimiters));
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
    if (__cur_str.equals("null")) { this.employee_id = null; } else {
      this.employee_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.employee_name = null; } else {
      this.employee_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.agency = null; } else {
      this.agency = __cur_str;
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
    if (__cur_str.equals("null")) { this.employee_id = null; } else {
      this.employee_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.employee_name = null; } else {
      this.employee_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.agency = null; } else {
      this.agency = __cur_str;
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
    mdm_ims_employee o = (mdm_ims_employee) super.clone();
    return o;
  }

  public void clone0(mdm_ims_employee o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("employee_id", this.employee_id);
    __sqoop$field_map.put("employee_name", this.employee_name);
    __sqoop$field_map.put("agency", this.agency);
    __sqoop$field_map.put("tenant_id", this.tenant_id);
    __sqoop$field_map.put("status", this.status);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("employee_id", this.employee_id);
    __sqoop$field_map.put("employee_name", this.employee_name);
    __sqoop$field_map.put("agency", this.agency);
    __sqoop$field_map.put("tenant_id", this.tenant_id);
    __sqoop$field_map.put("status", this.status);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("employee_id".equals(__fieldName)) {
      this.employee_id = (String) __fieldVal;
    }
    else    if ("employee_name".equals(__fieldName)) {
      this.employee_name = (String) __fieldVal;
    }
    else    if ("agency".equals(__fieldName)) {
      this.agency = (String) __fieldVal;
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
    if ("employee_id".equals(__fieldName)) {
      this.employee_id = (String) __fieldVal;
      return true;
    }
    else    if ("employee_name".equals(__fieldName)) {
      this.employee_name = (String) __fieldVal;
      return true;
    }
    else    if ("agency".equals(__fieldName)) {
      this.agency = (String) __fieldVal;
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

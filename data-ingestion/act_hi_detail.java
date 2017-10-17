// ORM class for table 'act_hi_detail'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Oct 16 15:03:50 IST 2017
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

public class act_hi_detail extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String id_;
  public String get_id_() {
    return id_;
  }
  public void set_id_(String id_) {
    this.id_ = id_;
  }
  public act_hi_detail with_id_(String id_) {
    this.id_ = id_;
    return this;
  }
  private String type_;
  public String get_type_() {
    return type_;
  }
  public void set_type_(String type_) {
    this.type_ = type_;
  }
  public act_hi_detail with_type_(String type_) {
    this.type_ = type_;
    return this;
  }
  private String proc_def_key_;
  public String get_proc_def_key_() {
    return proc_def_key_;
  }
  public void set_proc_def_key_(String proc_def_key_) {
    this.proc_def_key_ = proc_def_key_;
  }
  public act_hi_detail with_proc_def_key_(String proc_def_key_) {
    this.proc_def_key_ = proc_def_key_;
    return this;
  }
  private String proc_def_id_;
  public String get_proc_def_id_() {
    return proc_def_id_;
  }
  public void set_proc_def_id_(String proc_def_id_) {
    this.proc_def_id_ = proc_def_id_;
  }
  public act_hi_detail with_proc_def_id_(String proc_def_id_) {
    this.proc_def_id_ = proc_def_id_;
    return this;
  }
  private String proc_inst_id_;
  public String get_proc_inst_id_() {
    return proc_inst_id_;
  }
  public void set_proc_inst_id_(String proc_inst_id_) {
    this.proc_inst_id_ = proc_inst_id_;
  }
  public act_hi_detail with_proc_inst_id_(String proc_inst_id_) {
    this.proc_inst_id_ = proc_inst_id_;
    return this;
  }
  private String execution_id_;
  public String get_execution_id_() {
    return execution_id_;
  }
  public void set_execution_id_(String execution_id_) {
    this.execution_id_ = execution_id_;
  }
  public act_hi_detail with_execution_id_(String execution_id_) {
    this.execution_id_ = execution_id_;
    return this;
  }
  private String case_def_key_;
  public String get_case_def_key_() {
    return case_def_key_;
  }
  public void set_case_def_key_(String case_def_key_) {
    this.case_def_key_ = case_def_key_;
  }
  public act_hi_detail with_case_def_key_(String case_def_key_) {
    this.case_def_key_ = case_def_key_;
    return this;
  }
  private String case_def_id_;
  public String get_case_def_id_() {
    return case_def_id_;
  }
  public void set_case_def_id_(String case_def_id_) {
    this.case_def_id_ = case_def_id_;
  }
  public act_hi_detail with_case_def_id_(String case_def_id_) {
    this.case_def_id_ = case_def_id_;
    return this;
  }
  private String case_inst_id_;
  public String get_case_inst_id_() {
    return case_inst_id_;
  }
  public void set_case_inst_id_(String case_inst_id_) {
    this.case_inst_id_ = case_inst_id_;
  }
  public act_hi_detail with_case_inst_id_(String case_inst_id_) {
    this.case_inst_id_ = case_inst_id_;
    return this;
  }
  private String case_execution_id_;
  public String get_case_execution_id_() {
    return case_execution_id_;
  }
  public void set_case_execution_id_(String case_execution_id_) {
    this.case_execution_id_ = case_execution_id_;
  }
  public act_hi_detail with_case_execution_id_(String case_execution_id_) {
    this.case_execution_id_ = case_execution_id_;
    return this;
  }
  private String task_id_;
  public String get_task_id_() {
    return task_id_;
  }
  public void set_task_id_(String task_id_) {
    this.task_id_ = task_id_;
  }
  public act_hi_detail with_task_id_(String task_id_) {
    this.task_id_ = task_id_;
    return this;
  }
  private String act_inst_id_;
  public String get_act_inst_id_() {
    return act_inst_id_;
  }
  public void set_act_inst_id_(String act_inst_id_) {
    this.act_inst_id_ = act_inst_id_;
  }
  public act_hi_detail with_act_inst_id_(String act_inst_id_) {
    this.act_inst_id_ = act_inst_id_;
    return this;
  }
  private String var_inst_id_;
  public String get_var_inst_id_() {
    return var_inst_id_;
  }
  public void set_var_inst_id_(String var_inst_id_) {
    this.var_inst_id_ = var_inst_id_;
  }
  public act_hi_detail with_var_inst_id_(String var_inst_id_) {
    this.var_inst_id_ = var_inst_id_;
    return this;
  }
  private String name_;
  public String get_name_() {
    return name_;
  }
  public void set_name_(String name_) {
    this.name_ = name_;
  }
  public act_hi_detail with_name_(String name_) {
    this.name_ = name_;
    return this;
  }
  private String var_type_;
  public String get_var_type_() {
    return var_type_;
  }
  public void set_var_type_(String var_type_) {
    this.var_type_ = var_type_;
  }
  public act_hi_detail with_var_type_(String var_type_) {
    this.var_type_ = var_type_;
    return this;
  }
  private Integer rev_;
  public Integer get_rev_() {
    return rev_;
  }
  public void set_rev_(Integer rev_) {
    this.rev_ = rev_;
  }
  public act_hi_detail with_rev_(Integer rev_) {
    this.rev_ = rev_;
    return this;
  }
  private java.sql.Timestamp time_;
  public java.sql.Timestamp get_time_() {
    return time_;
  }
  public void set_time_(java.sql.Timestamp time_) {
    this.time_ = time_;
  }
  public act_hi_detail with_time_(java.sql.Timestamp time_) {
    this.time_ = time_;
    return this;
  }
  private String bytearray_id_;
  public String get_bytearray_id_() {
    return bytearray_id_;
  }
  public void set_bytearray_id_(String bytearray_id_) {
    this.bytearray_id_ = bytearray_id_;
  }
  public act_hi_detail with_bytearray_id_(String bytearray_id_) {
    this.bytearray_id_ = bytearray_id_;
    return this;
  }
  private Double double_;
  public Double get_double_() {
    return double_;
  }
  public void set_double_(Double double_) {
    this.double_ = double_;
  }
  public act_hi_detail with_double_(Double double_) {
    this.double_ = double_;
    return this;
  }
  private Long long_;
  public Long get_long_() {
    return long_;
  }
  public void set_long_(Long long_) {
    this.long_ = long_;
  }
  public act_hi_detail with_long_(Long long_) {
    this.long_ = long_;
    return this;
  }
  private String text_;
  public String get_text_() {
    return text_;
  }
  public void set_text_(String text_) {
    this.text_ = text_;
  }
  public act_hi_detail with_text_(String text_) {
    this.text_ = text_;
    return this;
  }
  private String text2_;
  public String get_text2_() {
    return text2_;
  }
  public void set_text2_(String text2_) {
    this.text2_ = text2_;
  }
  public act_hi_detail with_text2_(String text2_) {
    this.text2_ = text2_;
    return this;
  }
  private Long sequence_counter_;
  public Long get_sequence_counter_() {
    return sequence_counter_;
  }
  public void set_sequence_counter_(Long sequence_counter_) {
    this.sequence_counter_ = sequence_counter_;
  }
  public act_hi_detail with_sequence_counter_(Long sequence_counter_) {
    this.sequence_counter_ = sequence_counter_;
    return this;
  }
  private String tenant_id_;
  public String get_tenant_id_() {
    return tenant_id_;
  }
  public void set_tenant_id_(String tenant_id_) {
    this.tenant_id_ = tenant_id_;
  }
  public act_hi_detail with_tenant_id_(String tenant_id_) {
    this.tenant_id_ = tenant_id_;
    return this;
  }
  private String readable_proc_inst_id_;
  public String get_readable_proc_inst_id_() {
    return readable_proc_inst_id_;
  }
  public void set_readable_proc_inst_id_(String readable_proc_inst_id_) {
    this.readable_proc_inst_id_ = readable_proc_inst_id_;
  }
  public act_hi_detail with_readable_proc_inst_id_(String readable_proc_inst_id_) {
    this.readable_proc_inst_id_ = readable_proc_inst_id_;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof act_hi_detail)) {
      return false;
    }
    act_hi_detail that = (act_hi_detail) o;
    boolean equal = true;
    equal = equal && (this.id_ == null ? that.id_ == null : this.id_.equals(that.id_));
    equal = equal && (this.type_ == null ? that.type_ == null : this.type_.equals(that.type_));
    equal = equal && (this.proc_def_key_ == null ? that.proc_def_key_ == null : this.proc_def_key_.equals(that.proc_def_key_));
    equal = equal && (this.proc_def_id_ == null ? that.proc_def_id_ == null : this.proc_def_id_.equals(that.proc_def_id_));
    equal = equal && (this.proc_inst_id_ == null ? that.proc_inst_id_ == null : this.proc_inst_id_.equals(that.proc_inst_id_));
    equal = equal && (this.execution_id_ == null ? that.execution_id_ == null : this.execution_id_.equals(that.execution_id_));
    equal = equal && (this.case_def_key_ == null ? that.case_def_key_ == null : this.case_def_key_.equals(that.case_def_key_));
    equal = equal && (this.case_def_id_ == null ? that.case_def_id_ == null : this.case_def_id_.equals(that.case_def_id_));
    equal = equal && (this.case_inst_id_ == null ? that.case_inst_id_ == null : this.case_inst_id_.equals(that.case_inst_id_));
    equal = equal && (this.case_execution_id_ == null ? that.case_execution_id_ == null : this.case_execution_id_.equals(that.case_execution_id_));
    equal = equal && (this.task_id_ == null ? that.task_id_ == null : this.task_id_.equals(that.task_id_));
    equal = equal && (this.act_inst_id_ == null ? that.act_inst_id_ == null : this.act_inst_id_.equals(that.act_inst_id_));
    equal = equal && (this.var_inst_id_ == null ? that.var_inst_id_ == null : this.var_inst_id_.equals(that.var_inst_id_));
    equal = equal && (this.name_ == null ? that.name_ == null : this.name_.equals(that.name_));
    equal = equal && (this.var_type_ == null ? that.var_type_ == null : this.var_type_.equals(that.var_type_));
    equal = equal && (this.rev_ == null ? that.rev_ == null : this.rev_.equals(that.rev_));
    equal = equal && (this.time_ == null ? that.time_ == null : this.time_.equals(that.time_));
    equal = equal && (this.bytearray_id_ == null ? that.bytearray_id_ == null : this.bytearray_id_.equals(that.bytearray_id_));
    equal = equal && (this.double_ == null ? that.double_ == null : this.double_.equals(that.double_));
    equal = equal && (this.long_ == null ? that.long_ == null : this.long_.equals(that.long_));
    equal = equal && (this.text_ == null ? that.text_ == null : this.text_.equals(that.text_));
    equal = equal && (this.text2_ == null ? that.text2_ == null : this.text2_.equals(that.text2_));
    equal = equal && (this.sequence_counter_ == null ? that.sequence_counter_ == null : this.sequence_counter_.equals(that.sequence_counter_));
    equal = equal && (this.tenant_id_ == null ? that.tenant_id_ == null : this.tenant_id_.equals(that.tenant_id_));
    equal = equal && (this.readable_proc_inst_id_ == null ? that.readable_proc_inst_id_ == null : this.readable_proc_inst_id_.equals(that.readable_proc_inst_id_));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof act_hi_detail)) {
      return false;
    }
    act_hi_detail that = (act_hi_detail) o;
    boolean equal = true;
    equal = equal && (this.id_ == null ? that.id_ == null : this.id_.equals(that.id_));
    equal = equal && (this.type_ == null ? that.type_ == null : this.type_.equals(that.type_));
    equal = equal && (this.proc_def_key_ == null ? that.proc_def_key_ == null : this.proc_def_key_.equals(that.proc_def_key_));
    equal = equal && (this.proc_def_id_ == null ? that.proc_def_id_ == null : this.proc_def_id_.equals(that.proc_def_id_));
    equal = equal && (this.proc_inst_id_ == null ? that.proc_inst_id_ == null : this.proc_inst_id_.equals(that.proc_inst_id_));
    equal = equal && (this.execution_id_ == null ? that.execution_id_ == null : this.execution_id_.equals(that.execution_id_));
    equal = equal && (this.case_def_key_ == null ? that.case_def_key_ == null : this.case_def_key_.equals(that.case_def_key_));
    equal = equal && (this.case_def_id_ == null ? that.case_def_id_ == null : this.case_def_id_.equals(that.case_def_id_));
    equal = equal && (this.case_inst_id_ == null ? that.case_inst_id_ == null : this.case_inst_id_.equals(that.case_inst_id_));
    equal = equal && (this.case_execution_id_ == null ? that.case_execution_id_ == null : this.case_execution_id_.equals(that.case_execution_id_));
    equal = equal && (this.task_id_ == null ? that.task_id_ == null : this.task_id_.equals(that.task_id_));
    equal = equal && (this.act_inst_id_ == null ? that.act_inst_id_ == null : this.act_inst_id_.equals(that.act_inst_id_));
    equal = equal && (this.var_inst_id_ == null ? that.var_inst_id_ == null : this.var_inst_id_.equals(that.var_inst_id_));
    equal = equal && (this.name_ == null ? that.name_ == null : this.name_.equals(that.name_));
    equal = equal && (this.var_type_ == null ? that.var_type_ == null : this.var_type_.equals(that.var_type_));
    equal = equal && (this.rev_ == null ? that.rev_ == null : this.rev_.equals(that.rev_));
    equal = equal && (this.time_ == null ? that.time_ == null : this.time_.equals(that.time_));
    equal = equal && (this.bytearray_id_ == null ? that.bytearray_id_ == null : this.bytearray_id_.equals(that.bytearray_id_));
    equal = equal && (this.double_ == null ? that.double_ == null : this.double_.equals(that.double_));
    equal = equal && (this.long_ == null ? that.long_ == null : this.long_.equals(that.long_));
    equal = equal && (this.text_ == null ? that.text_ == null : this.text_.equals(that.text_));
    equal = equal && (this.text2_ == null ? that.text2_ == null : this.text2_.equals(that.text2_));
    equal = equal && (this.sequence_counter_ == null ? that.sequence_counter_ == null : this.sequence_counter_.equals(that.sequence_counter_));
    equal = equal && (this.tenant_id_ == null ? that.tenant_id_ == null : this.tenant_id_.equals(that.tenant_id_));
    equal = equal && (this.readable_proc_inst_id_ == null ? that.readable_proc_inst_id_ == null : this.readable_proc_inst_id_.equals(that.readable_proc_inst_id_));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id_ = JdbcWritableBridge.readString(1, __dbResults);
    this.type_ = JdbcWritableBridge.readString(2, __dbResults);
    this.proc_def_key_ = JdbcWritableBridge.readString(3, __dbResults);
    this.proc_def_id_ = JdbcWritableBridge.readString(4, __dbResults);
    this.proc_inst_id_ = JdbcWritableBridge.readString(5, __dbResults);
    this.execution_id_ = JdbcWritableBridge.readString(6, __dbResults);
    this.case_def_key_ = JdbcWritableBridge.readString(7, __dbResults);
    this.case_def_id_ = JdbcWritableBridge.readString(8, __dbResults);
    this.case_inst_id_ = JdbcWritableBridge.readString(9, __dbResults);
    this.case_execution_id_ = JdbcWritableBridge.readString(10, __dbResults);
    this.task_id_ = JdbcWritableBridge.readString(11, __dbResults);
    this.act_inst_id_ = JdbcWritableBridge.readString(12, __dbResults);
    this.var_inst_id_ = JdbcWritableBridge.readString(13, __dbResults);
    this.name_ = JdbcWritableBridge.readString(14, __dbResults);
    this.var_type_ = JdbcWritableBridge.readString(15, __dbResults);
    this.rev_ = JdbcWritableBridge.readInteger(16, __dbResults);
    this.time_ = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.bytearray_id_ = JdbcWritableBridge.readString(18, __dbResults);
    this.double_ = JdbcWritableBridge.readDouble(19, __dbResults);
    this.long_ = JdbcWritableBridge.readLong(20, __dbResults);
    this.text_ = JdbcWritableBridge.readString(21, __dbResults);
    this.text2_ = JdbcWritableBridge.readString(22, __dbResults);
    this.sequence_counter_ = JdbcWritableBridge.readLong(23, __dbResults);
    this.tenant_id_ = JdbcWritableBridge.readString(24, __dbResults);
    this.readable_proc_inst_id_ = JdbcWritableBridge.readString(25, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id_ = JdbcWritableBridge.readString(1, __dbResults);
    this.type_ = JdbcWritableBridge.readString(2, __dbResults);
    this.proc_def_key_ = JdbcWritableBridge.readString(3, __dbResults);
    this.proc_def_id_ = JdbcWritableBridge.readString(4, __dbResults);
    this.proc_inst_id_ = JdbcWritableBridge.readString(5, __dbResults);
    this.execution_id_ = JdbcWritableBridge.readString(6, __dbResults);
    this.case_def_key_ = JdbcWritableBridge.readString(7, __dbResults);
    this.case_def_id_ = JdbcWritableBridge.readString(8, __dbResults);
    this.case_inst_id_ = JdbcWritableBridge.readString(9, __dbResults);
    this.case_execution_id_ = JdbcWritableBridge.readString(10, __dbResults);
    this.task_id_ = JdbcWritableBridge.readString(11, __dbResults);
    this.act_inst_id_ = JdbcWritableBridge.readString(12, __dbResults);
    this.var_inst_id_ = JdbcWritableBridge.readString(13, __dbResults);
    this.name_ = JdbcWritableBridge.readString(14, __dbResults);
    this.var_type_ = JdbcWritableBridge.readString(15, __dbResults);
    this.rev_ = JdbcWritableBridge.readInteger(16, __dbResults);
    this.time_ = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.bytearray_id_ = JdbcWritableBridge.readString(18, __dbResults);
    this.double_ = JdbcWritableBridge.readDouble(19, __dbResults);
    this.long_ = JdbcWritableBridge.readLong(20, __dbResults);
    this.text_ = JdbcWritableBridge.readString(21, __dbResults);
    this.text2_ = JdbcWritableBridge.readString(22, __dbResults);
    this.sequence_counter_ = JdbcWritableBridge.readLong(23, __dbResults);
    this.tenant_id_ = JdbcWritableBridge.readString(24, __dbResults);
    this.readable_proc_inst_id_ = JdbcWritableBridge.readString(25, __dbResults);
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
    JdbcWritableBridge.writeString(id_, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(type_, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_def_key_, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_def_id_, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_inst_id_, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(execution_id_, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_def_key_, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_def_id_, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_inst_id_, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_execution_id_, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(task_id_, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(act_inst_id_, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(var_inst_id_, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name_, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(var_type_, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(rev_, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(time_, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(bytearray_id_, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(double_, 19 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeLong(long_, 20 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(text_, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(text2_, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(sequence_counter_, 23 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(tenant_id_, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(readable_proc_inst_id_, 25 + __off, 12, __dbStmt);
    return 25;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(id_, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(type_, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_def_key_, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_def_id_, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_inst_id_, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(execution_id_, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_def_key_, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_def_id_, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_inst_id_, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_execution_id_, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(task_id_, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(act_inst_id_, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(var_inst_id_, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name_, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(var_type_, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(rev_, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(time_, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(bytearray_id_, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(double_, 19 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeLong(long_, 20 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(text_, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(text2_, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(sequence_counter_, 23 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(tenant_id_, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(readable_proc_inst_id_, 25 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id_ = null;
    } else {
    this.id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.type_ = null;
    } else {
    this.type_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.proc_def_key_ = null;
    } else {
    this.proc_def_key_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.proc_def_id_ = null;
    } else {
    this.proc_def_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.proc_inst_id_ = null;
    } else {
    this.proc_inst_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.execution_id_ = null;
    } else {
    this.execution_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.case_def_key_ = null;
    } else {
    this.case_def_key_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.case_def_id_ = null;
    } else {
    this.case_def_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.case_inst_id_ = null;
    } else {
    this.case_inst_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.case_execution_id_ = null;
    } else {
    this.case_execution_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.task_id_ = null;
    } else {
    this.task_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.act_inst_id_ = null;
    } else {
    this.act_inst_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.var_inst_id_ = null;
    } else {
    this.var_inst_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.name_ = null;
    } else {
    this.name_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.var_type_ = null;
    } else {
    this.var_type_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.rev_ = null;
    } else {
    this.rev_ = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.time_ = null;
    } else {
    this.time_ = new Timestamp(__dataIn.readLong());
    this.time_.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.bytearray_id_ = null;
    } else {
    this.bytearray_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.double_ = null;
    } else {
    this.double_ = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.long_ = null;
    } else {
    this.long_ = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.text_ = null;
    } else {
    this.text_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.text2_ = null;
    } else {
    this.text2_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sequence_counter_ = null;
    } else {
    this.sequence_counter_ = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.tenant_id_ = null;
    } else {
    this.tenant_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.readable_proc_inst_id_ = null;
    } else {
    this.readable_proc_inst_id_ = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id_);
    }
    if (null == this.type_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, type_);
    }
    if (null == this.proc_def_key_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, proc_def_key_);
    }
    if (null == this.proc_def_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, proc_def_id_);
    }
    if (null == this.proc_inst_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, proc_inst_id_);
    }
    if (null == this.execution_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, execution_id_);
    }
    if (null == this.case_def_key_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, case_def_key_);
    }
    if (null == this.case_def_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, case_def_id_);
    }
    if (null == this.case_inst_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, case_inst_id_);
    }
    if (null == this.case_execution_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, case_execution_id_);
    }
    if (null == this.task_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, task_id_);
    }
    if (null == this.act_inst_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, act_inst_id_);
    }
    if (null == this.var_inst_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, var_inst_id_);
    }
    if (null == this.name_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_);
    }
    if (null == this.var_type_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, var_type_);
    }
    if (null == this.rev_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.rev_);
    }
    if (null == this.time_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.time_.getTime());
    __dataOut.writeInt(this.time_.getNanos());
    }
    if (null == this.bytearray_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bytearray_id_);
    }
    if (null == this.double_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.double_);
    }
    if (null == this.long_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.long_);
    }
    if (null == this.text_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, text_);
    }
    if (null == this.text2_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, text2_);
    }
    if (null == this.sequence_counter_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.sequence_counter_);
    }
    if (null == this.tenant_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tenant_id_);
    }
    if (null == this.readable_proc_inst_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, readable_proc_inst_id_);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id_);
    }
    if (null == this.type_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, type_);
    }
    if (null == this.proc_def_key_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, proc_def_key_);
    }
    if (null == this.proc_def_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, proc_def_id_);
    }
    if (null == this.proc_inst_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, proc_inst_id_);
    }
    if (null == this.execution_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, execution_id_);
    }
    if (null == this.case_def_key_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, case_def_key_);
    }
    if (null == this.case_def_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, case_def_id_);
    }
    if (null == this.case_inst_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, case_inst_id_);
    }
    if (null == this.case_execution_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, case_execution_id_);
    }
    if (null == this.task_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, task_id_);
    }
    if (null == this.act_inst_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, act_inst_id_);
    }
    if (null == this.var_inst_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, var_inst_id_);
    }
    if (null == this.name_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_);
    }
    if (null == this.var_type_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, var_type_);
    }
    if (null == this.rev_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.rev_);
    }
    if (null == this.time_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.time_.getTime());
    __dataOut.writeInt(this.time_.getNanos());
    }
    if (null == this.bytearray_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bytearray_id_);
    }
    if (null == this.double_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.double_);
    }
    if (null == this.long_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.long_);
    }
    if (null == this.text_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, text_);
    }
    if (null == this.text2_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, text2_);
    }
    if (null == this.sequence_counter_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.sequence_counter_);
    }
    if (null == this.tenant_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tenant_id_);
    }
    if (null == this.readable_proc_inst_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, readable_proc_inst_id_);
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
    __sb.append(FieldFormatter.escapeAndEnclose(id_==null?"null":id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(type_==null?"null":type_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(proc_def_key_==null?"null":proc_def_key_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(proc_def_id_==null?"null":proc_def_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(proc_inst_id_==null?"null":proc_inst_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(execution_id_==null?"null":execution_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(case_def_key_==null?"null":case_def_key_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(case_def_id_==null?"null":case_def_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(case_inst_id_==null?"null":case_inst_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(case_execution_id_==null?"null":case_execution_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(task_id_==null?"null":task_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(act_inst_id_==null?"null":act_inst_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(var_inst_id_==null?"null":var_inst_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_==null?"null":name_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(var_type_==null?"null":var_type_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rev_==null?"null":"" + rev_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time_==null?"null":"" + time_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bytearray_id_==null?"null":bytearray_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(double_==null?"null":"" + double_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(long_==null?"null":"" + long_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(text_==null?"null":text_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(text2_==null?"null":text2_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sequence_counter_==null?"null":"" + sequence_counter_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tenant_id_==null?"null":tenant_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(readable_proc_inst_id_==null?"null":readable_proc_inst_id_, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id_==null?"null":id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(type_==null?"null":type_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(proc_def_key_==null?"null":proc_def_key_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(proc_def_id_==null?"null":proc_def_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(proc_inst_id_==null?"null":proc_inst_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(execution_id_==null?"null":execution_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(case_def_key_==null?"null":case_def_key_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(case_def_id_==null?"null":case_def_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(case_inst_id_==null?"null":case_inst_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(case_execution_id_==null?"null":case_execution_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(task_id_==null?"null":task_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(act_inst_id_==null?"null":act_inst_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(var_inst_id_==null?"null":var_inst_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_==null?"null":name_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(var_type_==null?"null":var_type_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rev_==null?"null":"" + rev_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time_==null?"null":"" + time_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bytearray_id_==null?"null":bytearray_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(double_==null?"null":"" + double_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(long_==null?"null":"" + long_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(text_==null?"null":text_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(text2_==null?"null":text2_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sequence_counter_==null?"null":"" + sequence_counter_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tenant_id_==null?"null":tenant_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(readable_proc_inst_id_==null?"null":readable_proc_inst_id_, delimiters));
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
    if (__cur_str.equals("null")) { this.id_ = null; } else {
      this.id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.type_ = null; } else {
      this.type_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.proc_def_key_ = null; } else {
      this.proc_def_key_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.proc_def_id_ = null; } else {
      this.proc_def_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.proc_inst_id_ = null; } else {
      this.proc_inst_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.execution_id_ = null; } else {
      this.execution_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.case_def_key_ = null; } else {
      this.case_def_key_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.case_def_id_ = null; } else {
      this.case_def_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.case_inst_id_ = null; } else {
      this.case_inst_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.case_execution_id_ = null; } else {
      this.case_execution_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.task_id_ = null; } else {
      this.task_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.act_inst_id_ = null; } else {
      this.act_inst_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.var_inst_id_ = null; } else {
      this.var_inst_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name_ = null; } else {
      this.name_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.var_type_ = null; } else {
      this.var_type_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rev_ = null; } else {
      this.rev_ = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.time_ = null; } else {
      this.time_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bytearray_id_ = null; } else {
      this.bytearray_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.double_ = null; } else {
      this.double_ = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.long_ = null; } else {
      this.long_ = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.text_ = null; } else {
      this.text_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.text2_ = null; } else {
      this.text2_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sequence_counter_ = null; } else {
      this.sequence_counter_ = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tenant_id_ = null; } else {
      this.tenant_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.readable_proc_inst_id_ = null; } else {
      this.readable_proc_inst_id_ = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.id_ = null; } else {
      this.id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.type_ = null; } else {
      this.type_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.proc_def_key_ = null; } else {
      this.proc_def_key_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.proc_def_id_ = null; } else {
      this.proc_def_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.proc_inst_id_ = null; } else {
      this.proc_inst_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.execution_id_ = null; } else {
      this.execution_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.case_def_key_ = null; } else {
      this.case_def_key_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.case_def_id_ = null; } else {
      this.case_def_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.case_inst_id_ = null; } else {
      this.case_inst_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.case_execution_id_ = null; } else {
      this.case_execution_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.task_id_ = null; } else {
      this.task_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.act_inst_id_ = null; } else {
      this.act_inst_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.var_inst_id_ = null; } else {
      this.var_inst_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name_ = null; } else {
      this.name_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.var_type_ = null; } else {
      this.var_type_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rev_ = null; } else {
      this.rev_ = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.time_ = null; } else {
      this.time_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bytearray_id_ = null; } else {
      this.bytearray_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.double_ = null; } else {
      this.double_ = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.long_ = null; } else {
      this.long_ = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.text_ = null; } else {
      this.text_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.text2_ = null; } else {
      this.text2_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sequence_counter_ = null; } else {
      this.sequence_counter_ = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tenant_id_ = null; } else {
      this.tenant_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.readable_proc_inst_id_ = null; } else {
      this.readable_proc_inst_id_ = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    act_hi_detail o = (act_hi_detail) super.clone();
    o.time_ = (o.time_ != null) ? (java.sql.Timestamp) o.time_.clone() : null;
    return o;
  }

  public void clone0(act_hi_detail o) throws CloneNotSupportedException {
    o.time_ = (o.time_ != null) ? (java.sql.Timestamp) o.time_.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id_", this.id_);
    __sqoop$field_map.put("type_", this.type_);
    __sqoop$field_map.put("proc_def_key_", this.proc_def_key_);
    __sqoop$field_map.put("proc_def_id_", this.proc_def_id_);
    __sqoop$field_map.put("proc_inst_id_", this.proc_inst_id_);
    __sqoop$field_map.put("execution_id_", this.execution_id_);
    __sqoop$field_map.put("case_def_key_", this.case_def_key_);
    __sqoop$field_map.put("case_def_id_", this.case_def_id_);
    __sqoop$field_map.put("case_inst_id_", this.case_inst_id_);
    __sqoop$field_map.put("case_execution_id_", this.case_execution_id_);
    __sqoop$field_map.put("task_id_", this.task_id_);
    __sqoop$field_map.put("act_inst_id_", this.act_inst_id_);
    __sqoop$field_map.put("var_inst_id_", this.var_inst_id_);
    __sqoop$field_map.put("name_", this.name_);
    __sqoop$field_map.put("var_type_", this.var_type_);
    __sqoop$field_map.put("rev_", this.rev_);
    __sqoop$field_map.put("time_", this.time_);
    __sqoop$field_map.put("bytearray_id_", this.bytearray_id_);
    __sqoop$field_map.put("double_", this.double_);
    __sqoop$field_map.put("long_", this.long_);
    __sqoop$field_map.put("text_", this.text_);
    __sqoop$field_map.put("text2_", this.text2_);
    __sqoop$field_map.put("sequence_counter_", this.sequence_counter_);
    __sqoop$field_map.put("tenant_id_", this.tenant_id_);
    __sqoop$field_map.put("readable_proc_inst_id_", this.readable_proc_inst_id_);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id_", this.id_);
    __sqoop$field_map.put("type_", this.type_);
    __sqoop$field_map.put("proc_def_key_", this.proc_def_key_);
    __sqoop$field_map.put("proc_def_id_", this.proc_def_id_);
    __sqoop$field_map.put("proc_inst_id_", this.proc_inst_id_);
    __sqoop$field_map.put("execution_id_", this.execution_id_);
    __sqoop$field_map.put("case_def_key_", this.case_def_key_);
    __sqoop$field_map.put("case_def_id_", this.case_def_id_);
    __sqoop$field_map.put("case_inst_id_", this.case_inst_id_);
    __sqoop$field_map.put("case_execution_id_", this.case_execution_id_);
    __sqoop$field_map.put("task_id_", this.task_id_);
    __sqoop$field_map.put("act_inst_id_", this.act_inst_id_);
    __sqoop$field_map.put("var_inst_id_", this.var_inst_id_);
    __sqoop$field_map.put("name_", this.name_);
    __sqoop$field_map.put("var_type_", this.var_type_);
    __sqoop$field_map.put("rev_", this.rev_);
    __sqoop$field_map.put("time_", this.time_);
    __sqoop$field_map.put("bytearray_id_", this.bytearray_id_);
    __sqoop$field_map.put("double_", this.double_);
    __sqoop$field_map.put("long_", this.long_);
    __sqoop$field_map.put("text_", this.text_);
    __sqoop$field_map.put("text2_", this.text2_);
    __sqoop$field_map.put("sequence_counter_", this.sequence_counter_);
    __sqoop$field_map.put("tenant_id_", this.tenant_id_);
    __sqoop$field_map.put("readable_proc_inst_id_", this.readable_proc_inst_id_);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id_".equals(__fieldName)) {
      this.id_ = (String) __fieldVal;
    }
    else    if ("type_".equals(__fieldName)) {
      this.type_ = (String) __fieldVal;
    }
    else    if ("proc_def_key_".equals(__fieldName)) {
      this.proc_def_key_ = (String) __fieldVal;
    }
    else    if ("proc_def_id_".equals(__fieldName)) {
      this.proc_def_id_ = (String) __fieldVal;
    }
    else    if ("proc_inst_id_".equals(__fieldName)) {
      this.proc_inst_id_ = (String) __fieldVal;
    }
    else    if ("execution_id_".equals(__fieldName)) {
      this.execution_id_ = (String) __fieldVal;
    }
    else    if ("case_def_key_".equals(__fieldName)) {
      this.case_def_key_ = (String) __fieldVal;
    }
    else    if ("case_def_id_".equals(__fieldName)) {
      this.case_def_id_ = (String) __fieldVal;
    }
    else    if ("case_inst_id_".equals(__fieldName)) {
      this.case_inst_id_ = (String) __fieldVal;
    }
    else    if ("case_execution_id_".equals(__fieldName)) {
      this.case_execution_id_ = (String) __fieldVal;
    }
    else    if ("task_id_".equals(__fieldName)) {
      this.task_id_ = (String) __fieldVal;
    }
    else    if ("act_inst_id_".equals(__fieldName)) {
      this.act_inst_id_ = (String) __fieldVal;
    }
    else    if ("var_inst_id_".equals(__fieldName)) {
      this.var_inst_id_ = (String) __fieldVal;
    }
    else    if ("name_".equals(__fieldName)) {
      this.name_ = (String) __fieldVal;
    }
    else    if ("var_type_".equals(__fieldName)) {
      this.var_type_ = (String) __fieldVal;
    }
    else    if ("rev_".equals(__fieldName)) {
      this.rev_ = (Integer) __fieldVal;
    }
    else    if ("time_".equals(__fieldName)) {
      this.time_ = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("bytearray_id_".equals(__fieldName)) {
      this.bytearray_id_ = (String) __fieldVal;
    }
    else    if ("double_".equals(__fieldName)) {
      this.double_ = (Double) __fieldVal;
    }
    else    if ("long_".equals(__fieldName)) {
      this.long_ = (Long) __fieldVal;
    }
    else    if ("text_".equals(__fieldName)) {
      this.text_ = (String) __fieldVal;
    }
    else    if ("text2_".equals(__fieldName)) {
      this.text2_ = (String) __fieldVal;
    }
    else    if ("sequence_counter_".equals(__fieldName)) {
      this.sequence_counter_ = (Long) __fieldVal;
    }
    else    if ("tenant_id_".equals(__fieldName)) {
      this.tenant_id_ = (String) __fieldVal;
    }
    else    if ("readable_proc_inst_id_".equals(__fieldName)) {
      this.readable_proc_inst_id_ = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("id_".equals(__fieldName)) {
      this.id_ = (String) __fieldVal;
      return true;
    }
    else    if ("type_".equals(__fieldName)) {
      this.type_ = (String) __fieldVal;
      return true;
    }
    else    if ("proc_def_key_".equals(__fieldName)) {
      this.proc_def_key_ = (String) __fieldVal;
      return true;
    }
    else    if ("proc_def_id_".equals(__fieldName)) {
      this.proc_def_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("proc_inst_id_".equals(__fieldName)) {
      this.proc_inst_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("execution_id_".equals(__fieldName)) {
      this.execution_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("case_def_key_".equals(__fieldName)) {
      this.case_def_key_ = (String) __fieldVal;
      return true;
    }
    else    if ("case_def_id_".equals(__fieldName)) {
      this.case_def_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("case_inst_id_".equals(__fieldName)) {
      this.case_inst_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("case_execution_id_".equals(__fieldName)) {
      this.case_execution_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("task_id_".equals(__fieldName)) {
      this.task_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("act_inst_id_".equals(__fieldName)) {
      this.act_inst_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("var_inst_id_".equals(__fieldName)) {
      this.var_inst_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("name_".equals(__fieldName)) {
      this.name_ = (String) __fieldVal;
      return true;
    }
    else    if ("var_type_".equals(__fieldName)) {
      this.var_type_ = (String) __fieldVal;
      return true;
    }
    else    if ("rev_".equals(__fieldName)) {
      this.rev_ = (Integer) __fieldVal;
      return true;
    }
    else    if ("time_".equals(__fieldName)) {
      this.time_ = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("bytearray_id_".equals(__fieldName)) {
      this.bytearray_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("double_".equals(__fieldName)) {
      this.double_ = (Double) __fieldVal;
      return true;
    }
    else    if ("long_".equals(__fieldName)) {
      this.long_ = (Long) __fieldVal;
      return true;
    }
    else    if ("text_".equals(__fieldName)) {
      this.text_ = (String) __fieldVal;
      return true;
    }
    else    if ("text2_".equals(__fieldName)) {
      this.text2_ = (String) __fieldVal;
      return true;
    }
    else    if ("sequence_counter_".equals(__fieldName)) {
      this.sequence_counter_ = (Long) __fieldVal;
      return true;
    }
    else    if ("tenant_id_".equals(__fieldName)) {
      this.tenant_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("readable_proc_inst_id_".equals(__fieldName)) {
      this.readable_proc_inst_id_ = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

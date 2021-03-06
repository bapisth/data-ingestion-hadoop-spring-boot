// ORM class for table 'act_hi_taskinst'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Oct 16 18:19:14 IST 2017
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

public class act_hi_taskinst extends SqoopRecord  implements DBWritable, Writable {
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
  public act_hi_taskinst with_id_(String id_) {
    this.id_ = id_;
    return this;
  }
  private String task_def_key_;
  public String get_task_def_key_() {
    return task_def_key_;
  }
  public void set_task_def_key_(String task_def_key_) {
    this.task_def_key_ = task_def_key_;
  }
  public act_hi_taskinst with_task_def_key_(String task_def_key_) {
    this.task_def_key_ = task_def_key_;
    return this;
  }
  private String proc_def_key_;
  public String get_proc_def_key_() {
    return proc_def_key_;
  }
  public void set_proc_def_key_(String proc_def_key_) {
    this.proc_def_key_ = proc_def_key_;
  }
  public act_hi_taskinst with_proc_def_key_(String proc_def_key_) {
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
  public act_hi_taskinst with_proc_def_id_(String proc_def_id_) {
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
  public act_hi_taskinst with_proc_inst_id_(String proc_inst_id_) {
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
  public act_hi_taskinst with_execution_id_(String execution_id_) {
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
  public act_hi_taskinst with_case_def_key_(String case_def_key_) {
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
  public act_hi_taskinst with_case_def_id_(String case_def_id_) {
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
  public act_hi_taskinst with_case_inst_id_(String case_inst_id_) {
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
  public act_hi_taskinst with_case_execution_id_(String case_execution_id_) {
    this.case_execution_id_ = case_execution_id_;
    return this;
  }
  private String act_inst_id_;
  public String get_act_inst_id_() {
    return act_inst_id_;
  }
  public void set_act_inst_id_(String act_inst_id_) {
    this.act_inst_id_ = act_inst_id_;
  }
  public act_hi_taskinst with_act_inst_id_(String act_inst_id_) {
    this.act_inst_id_ = act_inst_id_;
    return this;
  }
  private String name_;
  public String get_name_() {
    return name_;
  }
  public void set_name_(String name_) {
    this.name_ = name_;
  }
  public act_hi_taskinst with_name_(String name_) {
    this.name_ = name_;
    return this;
  }
  private String parent_task_id_;
  public String get_parent_task_id_() {
    return parent_task_id_;
  }
  public void set_parent_task_id_(String parent_task_id_) {
    this.parent_task_id_ = parent_task_id_;
  }
  public act_hi_taskinst with_parent_task_id_(String parent_task_id_) {
    this.parent_task_id_ = parent_task_id_;
    return this;
  }
  private String description_;
  public String get_description_() {
    return description_;
  }
  public void set_description_(String description_) {
    this.description_ = description_;
  }
  public act_hi_taskinst with_description_(String description_) {
    this.description_ = description_;
    return this;
  }
  private String owner_;
  public String get_owner_() {
    return owner_;
  }
  public void set_owner_(String owner_) {
    this.owner_ = owner_;
  }
  public act_hi_taskinst with_owner_(String owner_) {
    this.owner_ = owner_;
    return this;
  }
  private String assignee_;
  public String get_assignee_() {
    return assignee_;
  }
  public void set_assignee_(String assignee_) {
    this.assignee_ = assignee_;
  }
  public act_hi_taskinst with_assignee_(String assignee_) {
    this.assignee_ = assignee_;
    return this;
  }
  private java.sql.Timestamp start_time_;
  public java.sql.Timestamp get_start_time_() {
    return start_time_;
  }
  public void set_start_time_(java.sql.Timestamp start_time_) {
    this.start_time_ = start_time_;
  }
  public act_hi_taskinst with_start_time_(java.sql.Timestamp start_time_) {
    this.start_time_ = start_time_;
    return this;
  }
  private java.sql.Timestamp end_time_;
  public java.sql.Timestamp get_end_time_() {
    return end_time_;
  }
  public void set_end_time_(java.sql.Timestamp end_time_) {
    this.end_time_ = end_time_;
  }
  public act_hi_taskinst with_end_time_(java.sql.Timestamp end_time_) {
    this.end_time_ = end_time_;
    return this;
  }
  private Long duration_;
  public Long get_duration_() {
    return duration_;
  }
  public void set_duration_(Long duration_) {
    this.duration_ = duration_;
  }
  public act_hi_taskinst with_duration_(Long duration_) {
    this.duration_ = duration_;
    return this;
  }
  private String delete_reason_;
  public String get_delete_reason_() {
    return delete_reason_;
  }
  public void set_delete_reason_(String delete_reason_) {
    this.delete_reason_ = delete_reason_;
  }
  public act_hi_taskinst with_delete_reason_(String delete_reason_) {
    this.delete_reason_ = delete_reason_;
    return this;
  }
  private Integer priority_;
  public Integer get_priority_() {
    return priority_;
  }
  public void set_priority_(Integer priority_) {
    this.priority_ = priority_;
  }
  public act_hi_taskinst with_priority_(Integer priority_) {
    this.priority_ = priority_;
    return this;
  }
  private java.sql.Timestamp due_date_;
  public java.sql.Timestamp get_due_date_() {
    return due_date_;
  }
  public void set_due_date_(java.sql.Timestamp due_date_) {
    this.due_date_ = due_date_;
  }
  public act_hi_taskinst with_due_date_(java.sql.Timestamp due_date_) {
    this.due_date_ = due_date_;
    return this;
  }
  private java.sql.Timestamp follow_up_date_;
  public java.sql.Timestamp get_follow_up_date_() {
    return follow_up_date_;
  }
  public void set_follow_up_date_(java.sql.Timestamp follow_up_date_) {
    this.follow_up_date_ = follow_up_date_;
  }
  public act_hi_taskinst with_follow_up_date_(java.sql.Timestamp follow_up_date_) {
    this.follow_up_date_ = follow_up_date_;
    return this;
  }
  private String tenant_id_;
  public String get_tenant_id_() {
    return tenant_id_;
  }
  public void set_tenant_id_(String tenant_id_) {
    this.tenant_id_ = tenant_id_;
  }
  public act_hi_taskinst with_tenant_id_(String tenant_id_) {
    this.tenant_id_ = tenant_id_;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof act_hi_taskinst)) {
      return false;
    }
    act_hi_taskinst that = (act_hi_taskinst) o;
    boolean equal = true;
    equal = equal && (this.id_ == null ? that.id_ == null : this.id_.equals(that.id_));
    equal = equal && (this.task_def_key_ == null ? that.task_def_key_ == null : this.task_def_key_.equals(that.task_def_key_));
    equal = equal && (this.proc_def_key_ == null ? that.proc_def_key_ == null : this.proc_def_key_.equals(that.proc_def_key_));
    equal = equal && (this.proc_def_id_ == null ? that.proc_def_id_ == null : this.proc_def_id_.equals(that.proc_def_id_));
    equal = equal && (this.proc_inst_id_ == null ? that.proc_inst_id_ == null : this.proc_inst_id_.equals(that.proc_inst_id_));
    equal = equal && (this.execution_id_ == null ? that.execution_id_ == null : this.execution_id_.equals(that.execution_id_));
    equal = equal && (this.case_def_key_ == null ? that.case_def_key_ == null : this.case_def_key_.equals(that.case_def_key_));
    equal = equal && (this.case_def_id_ == null ? that.case_def_id_ == null : this.case_def_id_.equals(that.case_def_id_));
    equal = equal && (this.case_inst_id_ == null ? that.case_inst_id_ == null : this.case_inst_id_.equals(that.case_inst_id_));
    equal = equal && (this.case_execution_id_ == null ? that.case_execution_id_ == null : this.case_execution_id_.equals(that.case_execution_id_));
    equal = equal && (this.act_inst_id_ == null ? that.act_inst_id_ == null : this.act_inst_id_.equals(that.act_inst_id_));
    equal = equal && (this.name_ == null ? that.name_ == null : this.name_.equals(that.name_));
    equal = equal && (this.parent_task_id_ == null ? that.parent_task_id_ == null : this.parent_task_id_.equals(that.parent_task_id_));
    equal = equal && (this.description_ == null ? that.description_ == null : this.description_.equals(that.description_));
    equal = equal && (this.owner_ == null ? that.owner_ == null : this.owner_.equals(that.owner_));
    equal = equal && (this.assignee_ == null ? that.assignee_ == null : this.assignee_.equals(that.assignee_));
    equal = equal && (this.start_time_ == null ? that.start_time_ == null : this.start_time_.equals(that.start_time_));
    equal = equal && (this.end_time_ == null ? that.end_time_ == null : this.end_time_.equals(that.end_time_));
    equal = equal && (this.duration_ == null ? that.duration_ == null : this.duration_.equals(that.duration_));
    equal = equal && (this.delete_reason_ == null ? that.delete_reason_ == null : this.delete_reason_.equals(that.delete_reason_));
    equal = equal && (this.priority_ == null ? that.priority_ == null : this.priority_.equals(that.priority_));
    equal = equal && (this.due_date_ == null ? that.due_date_ == null : this.due_date_.equals(that.due_date_));
    equal = equal && (this.follow_up_date_ == null ? that.follow_up_date_ == null : this.follow_up_date_.equals(that.follow_up_date_));
    equal = equal && (this.tenant_id_ == null ? that.tenant_id_ == null : this.tenant_id_.equals(that.tenant_id_));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof act_hi_taskinst)) {
      return false;
    }
    act_hi_taskinst that = (act_hi_taskinst) o;
    boolean equal = true;
    equal = equal && (this.id_ == null ? that.id_ == null : this.id_.equals(that.id_));
    equal = equal && (this.task_def_key_ == null ? that.task_def_key_ == null : this.task_def_key_.equals(that.task_def_key_));
    equal = equal && (this.proc_def_key_ == null ? that.proc_def_key_ == null : this.proc_def_key_.equals(that.proc_def_key_));
    equal = equal && (this.proc_def_id_ == null ? that.proc_def_id_ == null : this.proc_def_id_.equals(that.proc_def_id_));
    equal = equal && (this.proc_inst_id_ == null ? that.proc_inst_id_ == null : this.proc_inst_id_.equals(that.proc_inst_id_));
    equal = equal && (this.execution_id_ == null ? that.execution_id_ == null : this.execution_id_.equals(that.execution_id_));
    equal = equal && (this.case_def_key_ == null ? that.case_def_key_ == null : this.case_def_key_.equals(that.case_def_key_));
    equal = equal && (this.case_def_id_ == null ? that.case_def_id_ == null : this.case_def_id_.equals(that.case_def_id_));
    equal = equal && (this.case_inst_id_ == null ? that.case_inst_id_ == null : this.case_inst_id_.equals(that.case_inst_id_));
    equal = equal && (this.case_execution_id_ == null ? that.case_execution_id_ == null : this.case_execution_id_.equals(that.case_execution_id_));
    equal = equal && (this.act_inst_id_ == null ? that.act_inst_id_ == null : this.act_inst_id_.equals(that.act_inst_id_));
    equal = equal && (this.name_ == null ? that.name_ == null : this.name_.equals(that.name_));
    equal = equal && (this.parent_task_id_ == null ? that.parent_task_id_ == null : this.parent_task_id_.equals(that.parent_task_id_));
    equal = equal && (this.description_ == null ? that.description_ == null : this.description_.equals(that.description_));
    equal = equal && (this.owner_ == null ? that.owner_ == null : this.owner_.equals(that.owner_));
    equal = equal && (this.assignee_ == null ? that.assignee_ == null : this.assignee_.equals(that.assignee_));
    equal = equal && (this.start_time_ == null ? that.start_time_ == null : this.start_time_.equals(that.start_time_));
    equal = equal && (this.end_time_ == null ? that.end_time_ == null : this.end_time_.equals(that.end_time_));
    equal = equal && (this.duration_ == null ? that.duration_ == null : this.duration_.equals(that.duration_));
    equal = equal && (this.delete_reason_ == null ? that.delete_reason_ == null : this.delete_reason_.equals(that.delete_reason_));
    equal = equal && (this.priority_ == null ? that.priority_ == null : this.priority_.equals(that.priority_));
    equal = equal && (this.due_date_ == null ? that.due_date_ == null : this.due_date_.equals(that.due_date_));
    equal = equal && (this.follow_up_date_ == null ? that.follow_up_date_ == null : this.follow_up_date_.equals(that.follow_up_date_));
    equal = equal && (this.tenant_id_ == null ? that.tenant_id_ == null : this.tenant_id_.equals(that.tenant_id_));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id_ = JdbcWritableBridge.readString(1, __dbResults);
    this.task_def_key_ = JdbcWritableBridge.readString(2, __dbResults);
    this.proc_def_key_ = JdbcWritableBridge.readString(3, __dbResults);
    this.proc_def_id_ = JdbcWritableBridge.readString(4, __dbResults);
    this.proc_inst_id_ = JdbcWritableBridge.readString(5, __dbResults);
    this.execution_id_ = JdbcWritableBridge.readString(6, __dbResults);
    this.case_def_key_ = JdbcWritableBridge.readString(7, __dbResults);
    this.case_def_id_ = JdbcWritableBridge.readString(8, __dbResults);
    this.case_inst_id_ = JdbcWritableBridge.readString(9, __dbResults);
    this.case_execution_id_ = JdbcWritableBridge.readString(10, __dbResults);
    this.act_inst_id_ = JdbcWritableBridge.readString(11, __dbResults);
    this.name_ = JdbcWritableBridge.readString(12, __dbResults);
    this.parent_task_id_ = JdbcWritableBridge.readString(13, __dbResults);
    this.description_ = JdbcWritableBridge.readString(14, __dbResults);
    this.owner_ = JdbcWritableBridge.readString(15, __dbResults);
    this.assignee_ = JdbcWritableBridge.readString(16, __dbResults);
    this.start_time_ = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.end_time_ = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.duration_ = JdbcWritableBridge.readLong(19, __dbResults);
    this.delete_reason_ = JdbcWritableBridge.readString(20, __dbResults);
    this.priority_ = JdbcWritableBridge.readInteger(21, __dbResults);
    this.due_date_ = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.follow_up_date_ = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.tenant_id_ = JdbcWritableBridge.readString(24, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id_ = JdbcWritableBridge.readString(1, __dbResults);
    this.task_def_key_ = JdbcWritableBridge.readString(2, __dbResults);
    this.proc_def_key_ = JdbcWritableBridge.readString(3, __dbResults);
    this.proc_def_id_ = JdbcWritableBridge.readString(4, __dbResults);
    this.proc_inst_id_ = JdbcWritableBridge.readString(5, __dbResults);
    this.execution_id_ = JdbcWritableBridge.readString(6, __dbResults);
    this.case_def_key_ = JdbcWritableBridge.readString(7, __dbResults);
    this.case_def_id_ = JdbcWritableBridge.readString(8, __dbResults);
    this.case_inst_id_ = JdbcWritableBridge.readString(9, __dbResults);
    this.case_execution_id_ = JdbcWritableBridge.readString(10, __dbResults);
    this.act_inst_id_ = JdbcWritableBridge.readString(11, __dbResults);
    this.name_ = JdbcWritableBridge.readString(12, __dbResults);
    this.parent_task_id_ = JdbcWritableBridge.readString(13, __dbResults);
    this.description_ = JdbcWritableBridge.readString(14, __dbResults);
    this.owner_ = JdbcWritableBridge.readString(15, __dbResults);
    this.assignee_ = JdbcWritableBridge.readString(16, __dbResults);
    this.start_time_ = JdbcWritableBridge.readTimestamp(17, __dbResults);
    this.end_time_ = JdbcWritableBridge.readTimestamp(18, __dbResults);
    this.duration_ = JdbcWritableBridge.readLong(19, __dbResults);
    this.delete_reason_ = JdbcWritableBridge.readString(20, __dbResults);
    this.priority_ = JdbcWritableBridge.readInteger(21, __dbResults);
    this.due_date_ = JdbcWritableBridge.readTimestamp(22, __dbResults);
    this.follow_up_date_ = JdbcWritableBridge.readTimestamp(23, __dbResults);
    this.tenant_id_ = JdbcWritableBridge.readString(24, __dbResults);
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
    JdbcWritableBridge.writeString(task_def_key_, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_def_key_, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_def_id_, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_inst_id_, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(execution_id_, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_def_key_, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_def_id_, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_inst_id_, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_execution_id_, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(act_inst_id_, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name_, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(parent_task_id_, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(description_, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(owner_, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(assignee_, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(start_time_, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(end_time_, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(duration_, 19 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(delete_reason_, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(priority_, 21 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(due_date_, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(follow_up_date_, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(tenant_id_, 24 + __off, 12, __dbStmt);
    return 24;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(id_, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(task_def_key_, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_def_key_, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_def_id_, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_inst_id_, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(execution_id_, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_def_key_, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_def_id_, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_inst_id_, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_execution_id_, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(act_inst_id_, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name_, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(parent_task_id_, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(description_, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(owner_, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(assignee_, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(start_time_, 17 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(end_time_, 18 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(duration_, 19 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(delete_reason_, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(priority_, 21 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(due_date_, 22 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(follow_up_date_, 23 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(tenant_id_, 24 + __off, 12, __dbStmt);
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
        this.task_def_key_ = null;
    } else {
    this.task_def_key_ = Text.readString(__dataIn);
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
        this.act_inst_id_ = null;
    } else {
    this.act_inst_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.name_ = null;
    } else {
    this.name_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.parent_task_id_ = null;
    } else {
    this.parent_task_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.description_ = null;
    } else {
    this.description_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.owner_ = null;
    } else {
    this.owner_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.assignee_ = null;
    } else {
    this.assignee_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.start_time_ = null;
    } else {
    this.start_time_ = new Timestamp(__dataIn.readLong());
    this.start_time_.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.end_time_ = null;
    } else {
    this.end_time_ = new Timestamp(__dataIn.readLong());
    this.end_time_.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.duration_ = null;
    } else {
    this.duration_ = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.delete_reason_ = null;
    } else {
    this.delete_reason_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.priority_ = null;
    } else {
    this.priority_ = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.due_date_ = null;
    } else {
    this.due_date_ = new Timestamp(__dataIn.readLong());
    this.due_date_.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.follow_up_date_ = null;
    } else {
    this.follow_up_date_ = new Timestamp(__dataIn.readLong());
    this.follow_up_date_.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tenant_id_ = null;
    } else {
    this.tenant_id_ = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id_);
    }
    if (null == this.task_def_key_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, task_def_key_);
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
    if (null == this.act_inst_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, act_inst_id_);
    }
    if (null == this.name_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_);
    }
    if (null == this.parent_task_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, parent_task_id_);
    }
    if (null == this.description_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, description_);
    }
    if (null == this.owner_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, owner_);
    }
    if (null == this.assignee_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, assignee_);
    }
    if (null == this.start_time_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start_time_.getTime());
    __dataOut.writeInt(this.start_time_.getNanos());
    }
    if (null == this.end_time_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.end_time_.getTime());
    __dataOut.writeInt(this.end_time_.getNanos());
    }
    if (null == this.duration_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.duration_);
    }
    if (null == this.delete_reason_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, delete_reason_);
    }
    if (null == this.priority_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.priority_);
    }
    if (null == this.due_date_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.due_date_.getTime());
    __dataOut.writeInt(this.due_date_.getNanos());
    }
    if (null == this.follow_up_date_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.follow_up_date_.getTime());
    __dataOut.writeInt(this.follow_up_date_.getNanos());
    }
    if (null == this.tenant_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tenant_id_);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id_);
    }
    if (null == this.task_def_key_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, task_def_key_);
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
    if (null == this.act_inst_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, act_inst_id_);
    }
    if (null == this.name_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_);
    }
    if (null == this.parent_task_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, parent_task_id_);
    }
    if (null == this.description_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, description_);
    }
    if (null == this.owner_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, owner_);
    }
    if (null == this.assignee_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, assignee_);
    }
    if (null == this.start_time_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start_time_.getTime());
    __dataOut.writeInt(this.start_time_.getNanos());
    }
    if (null == this.end_time_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.end_time_.getTime());
    __dataOut.writeInt(this.end_time_.getNanos());
    }
    if (null == this.duration_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.duration_);
    }
    if (null == this.delete_reason_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, delete_reason_);
    }
    if (null == this.priority_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.priority_);
    }
    if (null == this.due_date_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.due_date_.getTime());
    __dataOut.writeInt(this.due_date_.getNanos());
    }
    if (null == this.follow_up_date_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.follow_up_date_.getTime());
    __dataOut.writeInt(this.follow_up_date_.getNanos());
    }
    if (null == this.tenant_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tenant_id_);
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
    __sb.append(FieldFormatter.escapeAndEnclose(task_def_key_==null?"null":task_def_key_, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(act_inst_id_==null?"null":act_inst_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_==null?"null":name_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(parent_task_id_==null?"null":parent_task_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(description_==null?"null":description_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(owner_==null?"null":owner_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(assignee_==null?"null":assignee_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_time_==null?"null":"" + start_time_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_time_==null?"null":"" + end_time_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(duration_==null?"null":"" + duration_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delete_reason_==null?"null":delete_reason_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(priority_==null?"null":"" + priority_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(due_date_==null?"null":"" + due_date_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(follow_up_date_==null?"null":"" + follow_up_date_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tenant_id_==null?"null":tenant_id_, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id_==null?"null":id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(task_def_key_==null?"null":task_def_key_, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(act_inst_id_==null?"null":act_inst_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_==null?"null":name_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(parent_task_id_==null?"null":parent_task_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(description_==null?"null":description_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(owner_==null?"null":owner_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(assignee_==null?"null":assignee_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_time_==null?"null":"" + start_time_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_time_==null?"null":"" + end_time_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(duration_==null?"null":"" + duration_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delete_reason_==null?"null":delete_reason_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(priority_==null?"null":"" + priority_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(due_date_==null?"null":"" + due_date_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(follow_up_date_==null?"null":"" + follow_up_date_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tenant_id_==null?"null":tenant_id_, delimiters));
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
    if (__cur_str.equals("null")) { this.task_def_key_ = null; } else {
      this.task_def_key_ = __cur_str;
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
    if (__cur_str.equals("null")) { this.act_inst_id_ = null; } else {
      this.act_inst_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name_ = null; } else {
      this.name_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.parent_task_id_ = null; } else {
      this.parent_task_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.description_ = null; } else {
      this.description_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.owner_ = null; } else {
      this.owner_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.assignee_ = null; } else {
      this.assignee_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_time_ = null; } else {
      this.start_time_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_time_ = null; } else {
      this.end_time_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.duration_ = null; } else {
      this.duration_ = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.delete_reason_ = null; } else {
      this.delete_reason_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.priority_ = null; } else {
      this.priority_ = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.due_date_ = null; } else {
      this.due_date_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.follow_up_date_ = null; } else {
      this.follow_up_date_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tenant_id_ = null; } else {
      this.tenant_id_ = __cur_str;
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
    if (__cur_str.equals("null")) { this.task_def_key_ = null; } else {
      this.task_def_key_ = __cur_str;
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
    if (__cur_str.equals("null")) { this.act_inst_id_ = null; } else {
      this.act_inst_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name_ = null; } else {
      this.name_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.parent_task_id_ = null; } else {
      this.parent_task_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.description_ = null; } else {
      this.description_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.owner_ = null; } else {
      this.owner_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.assignee_ = null; } else {
      this.assignee_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_time_ = null; } else {
      this.start_time_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_time_ = null; } else {
      this.end_time_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.duration_ = null; } else {
      this.duration_ = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.delete_reason_ = null; } else {
      this.delete_reason_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.priority_ = null; } else {
      this.priority_ = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.due_date_ = null; } else {
      this.due_date_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.follow_up_date_ = null; } else {
      this.follow_up_date_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tenant_id_ = null; } else {
      this.tenant_id_ = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    act_hi_taskinst o = (act_hi_taskinst) super.clone();
    o.start_time_ = (o.start_time_ != null) ? (java.sql.Timestamp) o.start_time_.clone() : null;
    o.end_time_ = (o.end_time_ != null) ? (java.sql.Timestamp) o.end_time_.clone() : null;
    o.due_date_ = (o.due_date_ != null) ? (java.sql.Timestamp) o.due_date_.clone() : null;
    o.follow_up_date_ = (o.follow_up_date_ != null) ? (java.sql.Timestamp) o.follow_up_date_.clone() : null;
    return o;
  }

  public void clone0(act_hi_taskinst o) throws CloneNotSupportedException {
    o.start_time_ = (o.start_time_ != null) ? (java.sql.Timestamp) o.start_time_.clone() : null;
    o.end_time_ = (o.end_time_ != null) ? (java.sql.Timestamp) o.end_time_.clone() : null;
    o.due_date_ = (o.due_date_ != null) ? (java.sql.Timestamp) o.due_date_.clone() : null;
    o.follow_up_date_ = (o.follow_up_date_ != null) ? (java.sql.Timestamp) o.follow_up_date_.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id_", this.id_);
    __sqoop$field_map.put("task_def_key_", this.task_def_key_);
    __sqoop$field_map.put("proc_def_key_", this.proc_def_key_);
    __sqoop$field_map.put("proc_def_id_", this.proc_def_id_);
    __sqoop$field_map.put("proc_inst_id_", this.proc_inst_id_);
    __sqoop$field_map.put("execution_id_", this.execution_id_);
    __sqoop$field_map.put("case_def_key_", this.case_def_key_);
    __sqoop$field_map.put("case_def_id_", this.case_def_id_);
    __sqoop$field_map.put("case_inst_id_", this.case_inst_id_);
    __sqoop$field_map.put("case_execution_id_", this.case_execution_id_);
    __sqoop$field_map.put("act_inst_id_", this.act_inst_id_);
    __sqoop$field_map.put("name_", this.name_);
    __sqoop$field_map.put("parent_task_id_", this.parent_task_id_);
    __sqoop$field_map.put("description_", this.description_);
    __sqoop$field_map.put("owner_", this.owner_);
    __sqoop$field_map.put("assignee_", this.assignee_);
    __sqoop$field_map.put("start_time_", this.start_time_);
    __sqoop$field_map.put("end_time_", this.end_time_);
    __sqoop$field_map.put("duration_", this.duration_);
    __sqoop$field_map.put("delete_reason_", this.delete_reason_);
    __sqoop$field_map.put("priority_", this.priority_);
    __sqoop$field_map.put("due_date_", this.due_date_);
    __sqoop$field_map.put("follow_up_date_", this.follow_up_date_);
    __sqoop$field_map.put("tenant_id_", this.tenant_id_);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id_", this.id_);
    __sqoop$field_map.put("task_def_key_", this.task_def_key_);
    __sqoop$field_map.put("proc_def_key_", this.proc_def_key_);
    __sqoop$field_map.put("proc_def_id_", this.proc_def_id_);
    __sqoop$field_map.put("proc_inst_id_", this.proc_inst_id_);
    __sqoop$field_map.put("execution_id_", this.execution_id_);
    __sqoop$field_map.put("case_def_key_", this.case_def_key_);
    __sqoop$field_map.put("case_def_id_", this.case_def_id_);
    __sqoop$field_map.put("case_inst_id_", this.case_inst_id_);
    __sqoop$field_map.put("case_execution_id_", this.case_execution_id_);
    __sqoop$field_map.put("act_inst_id_", this.act_inst_id_);
    __sqoop$field_map.put("name_", this.name_);
    __sqoop$field_map.put("parent_task_id_", this.parent_task_id_);
    __sqoop$field_map.put("description_", this.description_);
    __sqoop$field_map.put("owner_", this.owner_);
    __sqoop$field_map.put("assignee_", this.assignee_);
    __sqoop$field_map.put("start_time_", this.start_time_);
    __sqoop$field_map.put("end_time_", this.end_time_);
    __sqoop$field_map.put("duration_", this.duration_);
    __sqoop$field_map.put("delete_reason_", this.delete_reason_);
    __sqoop$field_map.put("priority_", this.priority_);
    __sqoop$field_map.put("due_date_", this.due_date_);
    __sqoop$field_map.put("follow_up_date_", this.follow_up_date_);
    __sqoop$field_map.put("tenant_id_", this.tenant_id_);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id_".equals(__fieldName)) {
      this.id_ = (String) __fieldVal;
    }
    else    if ("task_def_key_".equals(__fieldName)) {
      this.task_def_key_ = (String) __fieldVal;
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
    else    if ("act_inst_id_".equals(__fieldName)) {
      this.act_inst_id_ = (String) __fieldVal;
    }
    else    if ("name_".equals(__fieldName)) {
      this.name_ = (String) __fieldVal;
    }
    else    if ("parent_task_id_".equals(__fieldName)) {
      this.parent_task_id_ = (String) __fieldVal;
    }
    else    if ("description_".equals(__fieldName)) {
      this.description_ = (String) __fieldVal;
    }
    else    if ("owner_".equals(__fieldName)) {
      this.owner_ = (String) __fieldVal;
    }
    else    if ("assignee_".equals(__fieldName)) {
      this.assignee_ = (String) __fieldVal;
    }
    else    if ("start_time_".equals(__fieldName)) {
      this.start_time_ = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("end_time_".equals(__fieldName)) {
      this.end_time_ = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("duration_".equals(__fieldName)) {
      this.duration_ = (Long) __fieldVal;
    }
    else    if ("delete_reason_".equals(__fieldName)) {
      this.delete_reason_ = (String) __fieldVal;
    }
    else    if ("priority_".equals(__fieldName)) {
      this.priority_ = (Integer) __fieldVal;
    }
    else    if ("due_date_".equals(__fieldName)) {
      this.due_date_ = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("follow_up_date_".equals(__fieldName)) {
      this.follow_up_date_ = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("tenant_id_".equals(__fieldName)) {
      this.tenant_id_ = (String) __fieldVal;
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
    else    if ("task_def_key_".equals(__fieldName)) {
      this.task_def_key_ = (String) __fieldVal;
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
    else    if ("act_inst_id_".equals(__fieldName)) {
      this.act_inst_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("name_".equals(__fieldName)) {
      this.name_ = (String) __fieldVal;
      return true;
    }
    else    if ("parent_task_id_".equals(__fieldName)) {
      this.parent_task_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("description_".equals(__fieldName)) {
      this.description_ = (String) __fieldVal;
      return true;
    }
    else    if ("owner_".equals(__fieldName)) {
      this.owner_ = (String) __fieldVal;
      return true;
    }
    else    if ("assignee_".equals(__fieldName)) {
      this.assignee_ = (String) __fieldVal;
      return true;
    }
    else    if ("start_time_".equals(__fieldName)) {
      this.start_time_ = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("end_time_".equals(__fieldName)) {
      this.end_time_ = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("duration_".equals(__fieldName)) {
      this.duration_ = (Long) __fieldVal;
      return true;
    }
    else    if ("delete_reason_".equals(__fieldName)) {
      this.delete_reason_ = (String) __fieldVal;
      return true;
    }
    else    if ("priority_".equals(__fieldName)) {
      this.priority_ = (Integer) __fieldVal;
      return true;
    }
    else    if ("due_date_".equals(__fieldName)) {
      this.due_date_ = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("follow_up_date_".equals(__fieldName)) {
      this.follow_up_date_ = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("tenant_id_".equals(__fieldName)) {
      this.tenant_id_ = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

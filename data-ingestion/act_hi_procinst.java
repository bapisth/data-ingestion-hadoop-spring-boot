// ORM class for table 'act_hi_procinst'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Oct 16 18:26:09 IST 2017
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

public class act_hi_procinst extends SqoopRecord  implements DBWritable, Writable {
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
  public act_hi_procinst with_id_(String id_) {
    this.id_ = id_;
    return this;
  }
  private String proc_inst_id_;
  public String get_proc_inst_id_() {
    return proc_inst_id_;
  }
  public void set_proc_inst_id_(String proc_inst_id_) {
    this.proc_inst_id_ = proc_inst_id_;
  }
  public act_hi_procinst with_proc_inst_id_(String proc_inst_id_) {
    this.proc_inst_id_ = proc_inst_id_;
    return this;
  }
  private String business_key_;
  public String get_business_key_() {
    return business_key_;
  }
  public void set_business_key_(String business_key_) {
    this.business_key_ = business_key_;
  }
  public act_hi_procinst with_business_key_(String business_key_) {
    this.business_key_ = business_key_;
    return this;
  }
  private String proc_def_key_;
  public String get_proc_def_key_() {
    return proc_def_key_;
  }
  public void set_proc_def_key_(String proc_def_key_) {
    this.proc_def_key_ = proc_def_key_;
  }
  public act_hi_procinst with_proc_def_key_(String proc_def_key_) {
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
  public act_hi_procinst with_proc_def_id_(String proc_def_id_) {
    this.proc_def_id_ = proc_def_id_;
    return this;
  }
  private java.sql.Timestamp start_time_;
  public java.sql.Timestamp get_start_time_() {
    return start_time_;
  }
  public void set_start_time_(java.sql.Timestamp start_time_) {
    this.start_time_ = start_time_;
  }
  public act_hi_procinst with_start_time_(java.sql.Timestamp start_time_) {
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
  public act_hi_procinst with_end_time_(java.sql.Timestamp end_time_) {
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
  public act_hi_procinst with_duration_(Long duration_) {
    this.duration_ = duration_;
    return this;
  }
  private String start_user_id_;
  public String get_start_user_id_() {
    return start_user_id_;
  }
  public void set_start_user_id_(String start_user_id_) {
    this.start_user_id_ = start_user_id_;
  }
  public act_hi_procinst with_start_user_id_(String start_user_id_) {
    this.start_user_id_ = start_user_id_;
    return this;
  }
  private String start_act_id_;
  public String get_start_act_id_() {
    return start_act_id_;
  }
  public void set_start_act_id_(String start_act_id_) {
    this.start_act_id_ = start_act_id_;
  }
  public act_hi_procinst with_start_act_id_(String start_act_id_) {
    this.start_act_id_ = start_act_id_;
    return this;
  }
  private String end_act_id_;
  public String get_end_act_id_() {
    return end_act_id_;
  }
  public void set_end_act_id_(String end_act_id_) {
    this.end_act_id_ = end_act_id_;
  }
  public act_hi_procinst with_end_act_id_(String end_act_id_) {
    this.end_act_id_ = end_act_id_;
    return this;
  }
  private String super_process_instance_id_;
  public String get_super_process_instance_id_() {
    return super_process_instance_id_;
  }
  public void set_super_process_instance_id_(String super_process_instance_id_) {
    this.super_process_instance_id_ = super_process_instance_id_;
  }
  public act_hi_procinst with_super_process_instance_id_(String super_process_instance_id_) {
    this.super_process_instance_id_ = super_process_instance_id_;
    return this;
  }
  private String super_case_instance_id_;
  public String get_super_case_instance_id_() {
    return super_case_instance_id_;
  }
  public void set_super_case_instance_id_(String super_case_instance_id_) {
    this.super_case_instance_id_ = super_case_instance_id_;
  }
  public act_hi_procinst with_super_case_instance_id_(String super_case_instance_id_) {
    this.super_case_instance_id_ = super_case_instance_id_;
    return this;
  }
  private String case_inst_id_;
  public String get_case_inst_id_() {
    return case_inst_id_;
  }
  public void set_case_inst_id_(String case_inst_id_) {
    this.case_inst_id_ = case_inst_id_;
  }
  public act_hi_procinst with_case_inst_id_(String case_inst_id_) {
    this.case_inst_id_ = case_inst_id_;
    return this;
  }
  private String delete_reason_;
  public String get_delete_reason_() {
    return delete_reason_;
  }
  public void set_delete_reason_(String delete_reason_) {
    this.delete_reason_ = delete_reason_;
  }
  public act_hi_procinst with_delete_reason_(String delete_reason_) {
    this.delete_reason_ = delete_reason_;
    return this;
  }
  private String tenant_id_;
  public String get_tenant_id_() {
    return tenant_id_;
  }
  public void set_tenant_id_(String tenant_id_) {
    this.tenant_id_ = tenant_id_;
  }
  public act_hi_procinst with_tenant_id_(String tenant_id_) {
    this.tenant_id_ = tenant_id_;
    return this;
  }
  private String state_;
  public String get_state_() {
    return state_;
  }
  public void set_state_(String state_) {
    this.state_ = state_;
  }
  public act_hi_procinst with_state_(String state_) {
    this.state_ = state_;
    return this;
  }
  private String proc_inst_reference_id_;
  public String get_proc_inst_reference_id_() {
    return proc_inst_reference_id_;
  }
  public void set_proc_inst_reference_id_(String proc_inst_reference_id_) {
    this.proc_inst_reference_id_ = proc_inst_reference_id_;
  }
  public act_hi_procinst with_proc_inst_reference_id_(String proc_inst_reference_id_) {
    this.proc_inst_reference_id_ = proc_inst_reference_id_;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof act_hi_procinst)) {
      return false;
    }
    act_hi_procinst that = (act_hi_procinst) o;
    boolean equal = true;
    equal = equal && (this.id_ == null ? that.id_ == null : this.id_.equals(that.id_));
    equal = equal && (this.proc_inst_id_ == null ? that.proc_inst_id_ == null : this.proc_inst_id_.equals(that.proc_inst_id_));
    equal = equal && (this.business_key_ == null ? that.business_key_ == null : this.business_key_.equals(that.business_key_));
    equal = equal && (this.proc_def_key_ == null ? that.proc_def_key_ == null : this.proc_def_key_.equals(that.proc_def_key_));
    equal = equal && (this.proc_def_id_ == null ? that.proc_def_id_ == null : this.proc_def_id_.equals(that.proc_def_id_));
    equal = equal && (this.start_time_ == null ? that.start_time_ == null : this.start_time_.equals(that.start_time_));
    equal = equal && (this.end_time_ == null ? that.end_time_ == null : this.end_time_.equals(that.end_time_));
    equal = equal && (this.duration_ == null ? that.duration_ == null : this.duration_.equals(that.duration_));
    equal = equal && (this.start_user_id_ == null ? that.start_user_id_ == null : this.start_user_id_.equals(that.start_user_id_));
    equal = equal && (this.start_act_id_ == null ? that.start_act_id_ == null : this.start_act_id_.equals(that.start_act_id_));
    equal = equal && (this.end_act_id_ == null ? that.end_act_id_ == null : this.end_act_id_.equals(that.end_act_id_));
    equal = equal && (this.super_process_instance_id_ == null ? that.super_process_instance_id_ == null : this.super_process_instance_id_.equals(that.super_process_instance_id_));
    equal = equal && (this.super_case_instance_id_ == null ? that.super_case_instance_id_ == null : this.super_case_instance_id_.equals(that.super_case_instance_id_));
    equal = equal && (this.case_inst_id_ == null ? that.case_inst_id_ == null : this.case_inst_id_.equals(that.case_inst_id_));
    equal = equal && (this.delete_reason_ == null ? that.delete_reason_ == null : this.delete_reason_.equals(that.delete_reason_));
    equal = equal && (this.tenant_id_ == null ? that.tenant_id_ == null : this.tenant_id_.equals(that.tenant_id_));
    equal = equal && (this.state_ == null ? that.state_ == null : this.state_.equals(that.state_));
    equal = equal && (this.proc_inst_reference_id_ == null ? that.proc_inst_reference_id_ == null : this.proc_inst_reference_id_.equals(that.proc_inst_reference_id_));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof act_hi_procinst)) {
      return false;
    }
    act_hi_procinst that = (act_hi_procinst) o;
    boolean equal = true;
    equal = equal && (this.id_ == null ? that.id_ == null : this.id_.equals(that.id_));
    equal = equal && (this.proc_inst_id_ == null ? that.proc_inst_id_ == null : this.proc_inst_id_.equals(that.proc_inst_id_));
    equal = equal && (this.business_key_ == null ? that.business_key_ == null : this.business_key_.equals(that.business_key_));
    equal = equal && (this.proc_def_key_ == null ? that.proc_def_key_ == null : this.proc_def_key_.equals(that.proc_def_key_));
    equal = equal && (this.proc_def_id_ == null ? that.proc_def_id_ == null : this.proc_def_id_.equals(that.proc_def_id_));
    equal = equal && (this.start_time_ == null ? that.start_time_ == null : this.start_time_.equals(that.start_time_));
    equal = equal && (this.end_time_ == null ? that.end_time_ == null : this.end_time_.equals(that.end_time_));
    equal = equal && (this.duration_ == null ? that.duration_ == null : this.duration_.equals(that.duration_));
    equal = equal && (this.start_user_id_ == null ? that.start_user_id_ == null : this.start_user_id_.equals(that.start_user_id_));
    equal = equal && (this.start_act_id_ == null ? that.start_act_id_ == null : this.start_act_id_.equals(that.start_act_id_));
    equal = equal && (this.end_act_id_ == null ? that.end_act_id_ == null : this.end_act_id_.equals(that.end_act_id_));
    equal = equal && (this.super_process_instance_id_ == null ? that.super_process_instance_id_ == null : this.super_process_instance_id_.equals(that.super_process_instance_id_));
    equal = equal && (this.super_case_instance_id_ == null ? that.super_case_instance_id_ == null : this.super_case_instance_id_.equals(that.super_case_instance_id_));
    equal = equal && (this.case_inst_id_ == null ? that.case_inst_id_ == null : this.case_inst_id_.equals(that.case_inst_id_));
    equal = equal && (this.delete_reason_ == null ? that.delete_reason_ == null : this.delete_reason_.equals(that.delete_reason_));
    equal = equal && (this.tenant_id_ == null ? that.tenant_id_ == null : this.tenant_id_.equals(that.tenant_id_));
    equal = equal && (this.state_ == null ? that.state_ == null : this.state_.equals(that.state_));
    equal = equal && (this.proc_inst_reference_id_ == null ? that.proc_inst_reference_id_ == null : this.proc_inst_reference_id_.equals(that.proc_inst_reference_id_));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id_ = JdbcWritableBridge.readString(1, __dbResults);
    this.proc_inst_id_ = JdbcWritableBridge.readString(2, __dbResults);
    this.business_key_ = JdbcWritableBridge.readString(3, __dbResults);
    this.proc_def_key_ = JdbcWritableBridge.readString(4, __dbResults);
    this.proc_def_id_ = JdbcWritableBridge.readString(5, __dbResults);
    this.start_time_ = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.end_time_ = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.duration_ = JdbcWritableBridge.readLong(8, __dbResults);
    this.start_user_id_ = JdbcWritableBridge.readString(9, __dbResults);
    this.start_act_id_ = JdbcWritableBridge.readString(10, __dbResults);
    this.end_act_id_ = JdbcWritableBridge.readString(11, __dbResults);
    this.super_process_instance_id_ = JdbcWritableBridge.readString(12, __dbResults);
    this.super_case_instance_id_ = JdbcWritableBridge.readString(13, __dbResults);
    this.case_inst_id_ = JdbcWritableBridge.readString(14, __dbResults);
    this.delete_reason_ = JdbcWritableBridge.readString(15, __dbResults);
    this.tenant_id_ = JdbcWritableBridge.readString(16, __dbResults);
    this.state_ = JdbcWritableBridge.readString(17, __dbResults);
    this.proc_inst_reference_id_ = JdbcWritableBridge.readString(18, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id_ = JdbcWritableBridge.readString(1, __dbResults);
    this.proc_inst_id_ = JdbcWritableBridge.readString(2, __dbResults);
    this.business_key_ = JdbcWritableBridge.readString(3, __dbResults);
    this.proc_def_key_ = JdbcWritableBridge.readString(4, __dbResults);
    this.proc_def_id_ = JdbcWritableBridge.readString(5, __dbResults);
    this.start_time_ = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.end_time_ = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.duration_ = JdbcWritableBridge.readLong(8, __dbResults);
    this.start_user_id_ = JdbcWritableBridge.readString(9, __dbResults);
    this.start_act_id_ = JdbcWritableBridge.readString(10, __dbResults);
    this.end_act_id_ = JdbcWritableBridge.readString(11, __dbResults);
    this.super_process_instance_id_ = JdbcWritableBridge.readString(12, __dbResults);
    this.super_case_instance_id_ = JdbcWritableBridge.readString(13, __dbResults);
    this.case_inst_id_ = JdbcWritableBridge.readString(14, __dbResults);
    this.delete_reason_ = JdbcWritableBridge.readString(15, __dbResults);
    this.tenant_id_ = JdbcWritableBridge.readString(16, __dbResults);
    this.state_ = JdbcWritableBridge.readString(17, __dbResults);
    this.proc_inst_reference_id_ = JdbcWritableBridge.readString(18, __dbResults);
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
    JdbcWritableBridge.writeString(proc_inst_id_, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(business_key_, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_def_key_, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_def_id_, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(start_time_, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(end_time_, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(duration_, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(start_user_id_, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(start_act_id_, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(end_act_id_, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(super_process_instance_id_, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(super_case_instance_id_, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_inst_id_, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(delete_reason_, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tenant_id_, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state_, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_inst_reference_id_, 18 + __off, 12, __dbStmt);
    return 18;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(id_, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_inst_id_, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(business_key_, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_def_key_, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_def_id_, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(start_time_, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(end_time_, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(duration_, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(start_user_id_, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(start_act_id_, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(end_act_id_, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(super_process_instance_id_, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(super_case_instance_id_, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(case_inst_id_, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(delete_reason_, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tenant_id_, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state_, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(proc_inst_reference_id_, 18 + __off, 12, __dbStmt);
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
        this.proc_inst_id_ = null;
    } else {
    this.proc_inst_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.business_key_ = null;
    } else {
    this.business_key_ = Text.readString(__dataIn);
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
        this.start_user_id_ = null;
    } else {
    this.start_user_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.start_act_id_ = null;
    } else {
    this.start_act_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.end_act_id_ = null;
    } else {
    this.end_act_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.super_process_instance_id_ = null;
    } else {
    this.super_process_instance_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.super_case_instance_id_ = null;
    } else {
    this.super_case_instance_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.case_inst_id_ = null;
    } else {
    this.case_inst_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.delete_reason_ = null;
    } else {
    this.delete_reason_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tenant_id_ = null;
    } else {
    this.tenant_id_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.state_ = null;
    } else {
    this.state_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.proc_inst_reference_id_ = null;
    } else {
    this.proc_inst_reference_id_ = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id_);
    }
    if (null == this.proc_inst_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, proc_inst_id_);
    }
    if (null == this.business_key_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, business_key_);
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
    if (null == this.start_user_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, start_user_id_);
    }
    if (null == this.start_act_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, start_act_id_);
    }
    if (null == this.end_act_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, end_act_id_);
    }
    if (null == this.super_process_instance_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, super_process_instance_id_);
    }
    if (null == this.super_case_instance_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, super_case_instance_id_);
    }
    if (null == this.case_inst_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, case_inst_id_);
    }
    if (null == this.delete_reason_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, delete_reason_);
    }
    if (null == this.tenant_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tenant_id_);
    }
    if (null == this.state_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state_);
    }
    if (null == this.proc_inst_reference_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, proc_inst_reference_id_);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id_);
    }
    if (null == this.proc_inst_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, proc_inst_id_);
    }
    if (null == this.business_key_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, business_key_);
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
    if (null == this.start_user_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, start_user_id_);
    }
    if (null == this.start_act_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, start_act_id_);
    }
    if (null == this.end_act_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, end_act_id_);
    }
    if (null == this.super_process_instance_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, super_process_instance_id_);
    }
    if (null == this.super_case_instance_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, super_case_instance_id_);
    }
    if (null == this.case_inst_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, case_inst_id_);
    }
    if (null == this.delete_reason_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, delete_reason_);
    }
    if (null == this.tenant_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tenant_id_);
    }
    if (null == this.state_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state_);
    }
    if (null == this.proc_inst_reference_id_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, proc_inst_reference_id_);
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
    __sb.append(FieldFormatter.escapeAndEnclose(proc_inst_id_==null?"null":proc_inst_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(business_key_==null?"null":business_key_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(proc_def_key_==null?"null":proc_def_key_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(proc_def_id_==null?"null":proc_def_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_time_==null?"null":"" + start_time_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_time_==null?"null":"" + end_time_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(duration_==null?"null":"" + duration_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_user_id_==null?"null":start_user_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_act_id_==null?"null":start_act_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_act_id_==null?"null":end_act_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(super_process_instance_id_==null?"null":super_process_instance_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(super_case_instance_id_==null?"null":super_case_instance_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(case_inst_id_==null?"null":case_inst_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delete_reason_==null?"null":delete_reason_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tenant_id_==null?"null":tenant_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state_==null?"null":state_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(proc_inst_reference_id_==null?"null":proc_inst_reference_id_, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id_==null?"null":id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(proc_inst_id_==null?"null":proc_inst_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(business_key_==null?"null":business_key_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(proc_def_key_==null?"null":proc_def_key_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(proc_def_id_==null?"null":proc_def_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_time_==null?"null":"" + start_time_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_time_==null?"null":"" + end_time_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(duration_==null?"null":"" + duration_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_user_id_==null?"null":start_user_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_act_id_==null?"null":start_act_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_act_id_==null?"null":end_act_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(super_process_instance_id_==null?"null":super_process_instance_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(super_case_instance_id_==null?"null":super_case_instance_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(case_inst_id_==null?"null":case_inst_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delete_reason_==null?"null":delete_reason_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tenant_id_==null?"null":tenant_id_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state_==null?"null":state_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(proc_inst_reference_id_==null?"null":proc_inst_reference_id_, delimiters));
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
    if (__cur_str.equals("null")) { this.proc_inst_id_ = null; } else {
      this.proc_inst_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.business_key_ = null; } else {
      this.business_key_ = __cur_str;
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
    if (__cur_str.equals("null")) { this.start_user_id_ = null; } else {
      this.start_user_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.start_act_id_ = null; } else {
      this.start_act_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.end_act_id_ = null; } else {
      this.end_act_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.super_process_instance_id_ = null; } else {
      this.super_process_instance_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.super_case_instance_id_ = null; } else {
      this.super_case_instance_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.case_inst_id_ = null; } else {
      this.case_inst_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.delete_reason_ = null; } else {
      this.delete_reason_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tenant_id_ = null; } else {
      this.tenant_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state_ = null; } else {
      this.state_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.proc_inst_reference_id_ = null; } else {
      this.proc_inst_reference_id_ = __cur_str;
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
    if (__cur_str.equals("null")) { this.proc_inst_id_ = null; } else {
      this.proc_inst_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.business_key_ = null; } else {
      this.business_key_ = __cur_str;
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
    if (__cur_str.equals("null")) { this.start_user_id_ = null; } else {
      this.start_user_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.start_act_id_ = null; } else {
      this.start_act_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.end_act_id_ = null; } else {
      this.end_act_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.super_process_instance_id_ = null; } else {
      this.super_process_instance_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.super_case_instance_id_ = null; } else {
      this.super_case_instance_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.case_inst_id_ = null; } else {
      this.case_inst_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.delete_reason_ = null; } else {
      this.delete_reason_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tenant_id_ = null; } else {
      this.tenant_id_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.state_ = null; } else {
      this.state_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.proc_inst_reference_id_ = null; } else {
      this.proc_inst_reference_id_ = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    act_hi_procinst o = (act_hi_procinst) super.clone();
    o.start_time_ = (o.start_time_ != null) ? (java.sql.Timestamp) o.start_time_.clone() : null;
    o.end_time_ = (o.end_time_ != null) ? (java.sql.Timestamp) o.end_time_.clone() : null;
    return o;
  }

  public void clone0(act_hi_procinst o) throws CloneNotSupportedException {
    o.start_time_ = (o.start_time_ != null) ? (java.sql.Timestamp) o.start_time_.clone() : null;
    o.end_time_ = (o.end_time_ != null) ? (java.sql.Timestamp) o.end_time_.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("id_", this.id_);
    __sqoop$field_map.put("proc_inst_id_", this.proc_inst_id_);
    __sqoop$field_map.put("business_key_", this.business_key_);
    __sqoop$field_map.put("proc_def_key_", this.proc_def_key_);
    __sqoop$field_map.put("proc_def_id_", this.proc_def_id_);
    __sqoop$field_map.put("start_time_", this.start_time_);
    __sqoop$field_map.put("end_time_", this.end_time_);
    __sqoop$field_map.put("duration_", this.duration_);
    __sqoop$field_map.put("start_user_id_", this.start_user_id_);
    __sqoop$field_map.put("start_act_id_", this.start_act_id_);
    __sqoop$field_map.put("end_act_id_", this.end_act_id_);
    __sqoop$field_map.put("super_process_instance_id_", this.super_process_instance_id_);
    __sqoop$field_map.put("super_case_instance_id_", this.super_case_instance_id_);
    __sqoop$field_map.put("case_inst_id_", this.case_inst_id_);
    __sqoop$field_map.put("delete_reason_", this.delete_reason_);
    __sqoop$field_map.put("tenant_id_", this.tenant_id_);
    __sqoop$field_map.put("state_", this.state_);
    __sqoop$field_map.put("proc_inst_reference_id_", this.proc_inst_reference_id_);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id_", this.id_);
    __sqoop$field_map.put("proc_inst_id_", this.proc_inst_id_);
    __sqoop$field_map.put("business_key_", this.business_key_);
    __sqoop$field_map.put("proc_def_key_", this.proc_def_key_);
    __sqoop$field_map.put("proc_def_id_", this.proc_def_id_);
    __sqoop$field_map.put("start_time_", this.start_time_);
    __sqoop$field_map.put("end_time_", this.end_time_);
    __sqoop$field_map.put("duration_", this.duration_);
    __sqoop$field_map.put("start_user_id_", this.start_user_id_);
    __sqoop$field_map.put("start_act_id_", this.start_act_id_);
    __sqoop$field_map.put("end_act_id_", this.end_act_id_);
    __sqoop$field_map.put("super_process_instance_id_", this.super_process_instance_id_);
    __sqoop$field_map.put("super_case_instance_id_", this.super_case_instance_id_);
    __sqoop$field_map.put("case_inst_id_", this.case_inst_id_);
    __sqoop$field_map.put("delete_reason_", this.delete_reason_);
    __sqoop$field_map.put("tenant_id_", this.tenant_id_);
    __sqoop$field_map.put("state_", this.state_);
    __sqoop$field_map.put("proc_inst_reference_id_", this.proc_inst_reference_id_);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("id_".equals(__fieldName)) {
      this.id_ = (String) __fieldVal;
    }
    else    if ("proc_inst_id_".equals(__fieldName)) {
      this.proc_inst_id_ = (String) __fieldVal;
    }
    else    if ("business_key_".equals(__fieldName)) {
      this.business_key_ = (String) __fieldVal;
    }
    else    if ("proc_def_key_".equals(__fieldName)) {
      this.proc_def_key_ = (String) __fieldVal;
    }
    else    if ("proc_def_id_".equals(__fieldName)) {
      this.proc_def_id_ = (String) __fieldVal;
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
    else    if ("start_user_id_".equals(__fieldName)) {
      this.start_user_id_ = (String) __fieldVal;
    }
    else    if ("start_act_id_".equals(__fieldName)) {
      this.start_act_id_ = (String) __fieldVal;
    }
    else    if ("end_act_id_".equals(__fieldName)) {
      this.end_act_id_ = (String) __fieldVal;
    }
    else    if ("super_process_instance_id_".equals(__fieldName)) {
      this.super_process_instance_id_ = (String) __fieldVal;
    }
    else    if ("super_case_instance_id_".equals(__fieldName)) {
      this.super_case_instance_id_ = (String) __fieldVal;
    }
    else    if ("case_inst_id_".equals(__fieldName)) {
      this.case_inst_id_ = (String) __fieldVal;
    }
    else    if ("delete_reason_".equals(__fieldName)) {
      this.delete_reason_ = (String) __fieldVal;
    }
    else    if ("tenant_id_".equals(__fieldName)) {
      this.tenant_id_ = (String) __fieldVal;
    }
    else    if ("state_".equals(__fieldName)) {
      this.state_ = (String) __fieldVal;
    }
    else    if ("proc_inst_reference_id_".equals(__fieldName)) {
      this.proc_inst_reference_id_ = (String) __fieldVal;
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
    else    if ("proc_inst_id_".equals(__fieldName)) {
      this.proc_inst_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("business_key_".equals(__fieldName)) {
      this.business_key_ = (String) __fieldVal;
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
    else    if ("start_user_id_".equals(__fieldName)) {
      this.start_user_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("start_act_id_".equals(__fieldName)) {
      this.start_act_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("end_act_id_".equals(__fieldName)) {
      this.end_act_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("super_process_instance_id_".equals(__fieldName)) {
      this.super_process_instance_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("super_case_instance_id_".equals(__fieldName)) {
      this.super_case_instance_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("case_inst_id_".equals(__fieldName)) {
      this.case_inst_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("delete_reason_".equals(__fieldName)) {
      this.delete_reason_ = (String) __fieldVal;
      return true;
    }
    else    if ("tenant_id_".equals(__fieldName)) {
      this.tenant_id_ = (String) __fieldVal;
      return true;
    }
    else    if ("state_".equals(__fieldName)) {
      this.state_ = (String) __fieldVal;
      return true;
    }
    else    if ("proc_inst_reference_id_".equals(__fieldName)) {
      this.proc_inst_reference_id_ = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

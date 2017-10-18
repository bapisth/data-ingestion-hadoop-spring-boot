// ORM class for table 'act_hi_actinst'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Oct 18 11:22:50 IST 2017
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

public class act_hi_actinst extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String ID_;
  public String get_ID_() {
    return ID_;
  }
  public void set_ID_(String ID_) {
    this.ID_ = ID_;
  }
  public act_hi_actinst with_ID_(String ID_) {
    this.ID_ = ID_;
    return this;
  }
  private String PROC_DEF_ID_;
  public String get_PROC_DEF_ID_() {
    return PROC_DEF_ID_;
  }
  public void set_PROC_DEF_ID_(String PROC_DEF_ID_) {
    this.PROC_DEF_ID_ = PROC_DEF_ID_;
  }
  public act_hi_actinst with_PROC_DEF_ID_(String PROC_DEF_ID_) {
    this.PROC_DEF_ID_ = PROC_DEF_ID_;
    return this;
  }
  private String PROC_INST_ID_;
  public String get_PROC_INST_ID_() {
    return PROC_INST_ID_;
  }
  public void set_PROC_INST_ID_(String PROC_INST_ID_) {
    this.PROC_INST_ID_ = PROC_INST_ID_;
  }
  public act_hi_actinst with_PROC_INST_ID_(String PROC_INST_ID_) {
    this.PROC_INST_ID_ = PROC_INST_ID_;
    return this;
  }
  private String EXECUTION_ID_;
  public String get_EXECUTION_ID_() {
    return EXECUTION_ID_;
  }
  public void set_EXECUTION_ID_(String EXECUTION_ID_) {
    this.EXECUTION_ID_ = EXECUTION_ID_;
  }
  public act_hi_actinst with_EXECUTION_ID_(String EXECUTION_ID_) {
    this.EXECUTION_ID_ = EXECUTION_ID_;
    return this;
  }
  private String ACT_ID_;
  public String get_ACT_ID_() {
    return ACT_ID_;
  }
  public void set_ACT_ID_(String ACT_ID_) {
    this.ACT_ID_ = ACT_ID_;
  }
  public act_hi_actinst with_ACT_ID_(String ACT_ID_) {
    this.ACT_ID_ = ACT_ID_;
    return this;
  }
  private String TASK_ID_;
  public String get_TASK_ID_() {
    return TASK_ID_;
  }
  public void set_TASK_ID_(String TASK_ID_) {
    this.TASK_ID_ = TASK_ID_;
  }
  public act_hi_actinst with_TASK_ID_(String TASK_ID_) {
    this.TASK_ID_ = TASK_ID_;
    return this;
  }
  private String CALL_PROC_INST_ID_;
  public String get_CALL_PROC_INST_ID_() {
    return CALL_PROC_INST_ID_;
  }
  public void set_CALL_PROC_INST_ID_(String CALL_PROC_INST_ID_) {
    this.CALL_PROC_INST_ID_ = CALL_PROC_INST_ID_;
  }
  public act_hi_actinst with_CALL_PROC_INST_ID_(String CALL_PROC_INST_ID_) {
    this.CALL_PROC_INST_ID_ = CALL_PROC_INST_ID_;
    return this;
  }
  private String ACT_NAME_;
  public String get_ACT_NAME_() {
    return ACT_NAME_;
  }
  public void set_ACT_NAME_(String ACT_NAME_) {
    this.ACT_NAME_ = ACT_NAME_;
  }
  public act_hi_actinst with_ACT_NAME_(String ACT_NAME_) {
    this.ACT_NAME_ = ACT_NAME_;
    return this;
  }
  private String ACT_TYPE_;
  public String get_ACT_TYPE_() {
    return ACT_TYPE_;
  }
  public void set_ACT_TYPE_(String ACT_TYPE_) {
    this.ACT_TYPE_ = ACT_TYPE_;
  }
  public act_hi_actinst with_ACT_TYPE_(String ACT_TYPE_) {
    this.ACT_TYPE_ = ACT_TYPE_;
    return this;
  }
  private String ASSIGNEE_;
  public String get_ASSIGNEE_() {
    return ASSIGNEE_;
  }
  public void set_ASSIGNEE_(String ASSIGNEE_) {
    this.ASSIGNEE_ = ASSIGNEE_;
  }
  public act_hi_actinst with_ASSIGNEE_(String ASSIGNEE_) {
    this.ASSIGNEE_ = ASSIGNEE_;
    return this;
  }
  private java.sql.Timestamp START_TIME_;
  public java.sql.Timestamp get_START_TIME_() {
    return START_TIME_;
  }
  public void set_START_TIME_(java.sql.Timestamp START_TIME_) {
    this.START_TIME_ = START_TIME_;
  }
  public act_hi_actinst with_START_TIME_(java.sql.Timestamp START_TIME_) {
    this.START_TIME_ = START_TIME_;
    return this;
  }
  private java.sql.Timestamp END_TIME_;
  public java.sql.Timestamp get_END_TIME_() {
    return END_TIME_;
  }
  public void set_END_TIME_(java.sql.Timestamp END_TIME_) {
    this.END_TIME_ = END_TIME_;
  }
  public act_hi_actinst with_END_TIME_(java.sql.Timestamp END_TIME_) {
    this.END_TIME_ = END_TIME_;
    return this;
  }
  private Long DURATION_;
  public Long get_DURATION_() {
    return DURATION_;
  }
  public void set_DURATION_(Long DURATION_) {
    this.DURATION_ = DURATION_;
  }
  public act_hi_actinst with_DURATION_(Long DURATION_) {
    this.DURATION_ = DURATION_;
    return this;
  }
  private String TENANT_ID_;
  public String get_TENANT_ID_() {
    return TENANT_ID_;
  }
  public void set_TENANT_ID_(String TENANT_ID_) {
    this.TENANT_ID_ = TENANT_ID_;
  }
  public act_hi_actinst with_TENANT_ID_(String TENANT_ID_) {
    this.TENANT_ID_ = TENANT_ID_;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof act_hi_actinst)) {
      return false;
    }
    act_hi_actinst that = (act_hi_actinst) o;
    boolean equal = true;
    equal = equal && (this.ID_ == null ? that.ID_ == null : this.ID_.equals(that.ID_));
    equal = equal && (this.PROC_DEF_ID_ == null ? that.PROC_DEF_ID_ == null : this.PROC_DEF_ID_.equals(that.PROC_DEF_ID_));
    equal = equal && (this.PROC_INST_ID_ == null ? that.PROC_INST_ID_ == null : this.PROC_INST_ID_.equals(that.PROC_INST_ID_));
    equal = equal && (this.EXECUTION_ID_ == null ? that.EXECUTION_ID_ == null : this.EXECUTION_ID_.equals(that.EXECUTION_ID_));
    equal = equal && (this.ACT_ID_ == null ? that.ACT_ID_ == null : this.ACT_ID_.equals(that.ACT_ID_));
    equal = equal && (this.TASK_ID_ == null ? that.TASK_ID_ == null : this.TASK_ID_.equals(that.TASK_ID_));
    equal = equal && (this.CALL_PROC_INST_ID_ == null ? that.CALL_PROC_INST_ID_ == null : this.CALL_PROC_INST_ID_.equals(that.CALL_PROC_INST_ID_));
    equal = equal && (this.ACT_NAME_ == null ? that.ACT_NAME_ == null : this.ACT_NAME_.equals(that.ACT_NAME_));
    equal = equal && (this.ACT_TYPE_ == null ? that.ACT_TYPE_ == null : this.ACT_TYPE_.equals(that.ACT_TYPE_));
    equal = equal && (this.ASSIGNEE_ == null ? that.ASSIGNEE_ == null : this.ASSIGNEE_.equals(that.ASSIGNEE_));
    equal = equal && (this.START_TIME_ == null ? that.START_TIME_ == null : this.START_TIME_.equals(that.START_TIME_));
    equal = equal && (this.END_TIME_ == null ? that.END_TIME_ == null : this.END_TIME_.equals(that.END_TIME_));
    equal = equal && (this.DURATION_ == null ? that.DURATION_ == null : this.DURATION_.equals(that.DURATION_));
    equal = equal && (this.TENANT_ID_ == null ? that.TENANT_ID_ == null : this.TENANT_ID_.equals(that.TENANT_ID_));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof act_hi_actinst)) {
      return false;
    }
    act_hi_actinst that = (act_hi_actinst) o;
    boolean equal = true;
    equal = equal && (this.ID_ == null ? that.ID_ == null : this.ID_.equals(that.ID_));
    equal = equal && (this.PROC_DEF_ID_ == null ? that.PROC_DEF_ID_ == null : this.PROC_DEF_ID_.equals(that.PROC_DEF_ID_));
    equal = equal && (this.PROC_INST_ID_ == null ? that.PROC_INST_ID_ == null : this.PROC_INST_ID_.equals(that.PROC_INST_ID_));
    equal = equal && (this.EXECUTION_ID_ == null ? that.EXECUTION_ID_ == null : this.EXECUTION_ID_.equals(that.EXECUTION_ID_));
    equal = equal && (this.ACT_ID_ == null ? that.ACT_ID_ == null : this.ACT_ID_.equals(that.ACT_ID_));
    equal = equal && (this.TASK_ID_ == null ? that.TASK_ID_ == null : this.TASK_ID_.equals(that.TASK_ID_));
    equal = equal && (this.CALL_PROC_INST_ID_ == null ? that.CALL_PROC_INST_ID_ == null : this.CALL_PROC_INST_ID_.equals(that.CALL_PROC_INST_ID_));
    equal = equal && (this.ACT_NAME_ == null ? that.ACT_NAME_ == null : this.ACT_NAME_.equals(that.ACT_NAME_));
    equal = equal && (this.ACT_TYPE_ == null ? that.ACT_TYPE_ == null : this.ACT_TYPE_.equals(that.ACT_TYPE_));
    equal = equal && (this.ASSIGNEE_ == null ? that.ASSIGNEE_ == null : this.ASSIGNEE_.equals(that.ASSIGNEE_));
    equal = equal && (this.START_TIME_ == null ? that.START_TIME_ == null : this.START_TIME_.equals(that.START_TIME_));
    equal = equal && (this.END_TIME_ == null ? that.END_TIME_ == null : this.END_TIME_.equals(that.END_TIME_));
    equal = equal && (this.DURATION_ == null ? that.DURATION_ == null : this.DURATION_.equals(that.DURATION_));
    equal = equal && (this.TENANT_ID_ == null ? that.TENANT_ID_ == null : this.TENANT_ID_.equals(that.TENANT_ID_));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.ID_ = JdbcWritableBridge.readString(1, __dbResults);
    this.PROC_DEF_ID_ = JdbcWritableBridge.readString(2, __dbResults);
    this.PROC_INST_ID_ = JdbcWritableBridge.readString(3, __dbResults);
    this.EXECUTION_ID_ = JdbcWritableBridge.readString(4, __dbResults);
    this.ACT_ID_ = JdbcWritableBridge.readString(5, __dbResults);
    this.TASK_ID_ = JdbcWritableBridge.readString(6, __dbResults);
    this.CALL_PROC_INST_ID_ = JdbcWritableBridge.readString(7, __dbResults);
    this.ACT_NAME_ = JdbcWritableBridge.readString(8, __dbResults);
    this.ACT_TYPE_ = JdbcWritableBridge.readString(9, __dbResults);
    this.ASSIGNEE_ = JdbcWritableBridge.readString(10, __dbResults);
    this.START_TIME_ = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.END_TIME_ = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.DURATION_ = JdbcWritableBridge.readLong(13, __dbResults);
    this.TENANT_ID_ = JdbcWritableBridge.readString(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.ID_ = JdbcWritableBridge.readString(1, __dbResults);
    this.PROC_DEF_ID_ = JdbcWritableBridge.readString(2, __dbResults);
    this.PROC_INST_ID_ = JdbcWritableBridge.readString(3, __dbResults);
    this.EXECUTION_ID_ = JdbcWritableBridge.readString(4, __dbResults);
    this.ACT_ID_ = JdbcWritableBridge.readString(5, __dbResults);
    this.TASK_ID_ = JdbcWritableBridge.readString(6, __dbResults);
    this.CALL_PROC_INST_ID_ = JdbcWritableBridge.readString(7, __dbResults);
    this.ACT_NAME_ = JdbcWritableBridge.readString(8, __dbResults);
    this.ACT_TYPE_ = JdbcWritableBridge.readString(9, __dbResults);
    this.ASSIGNEE_ = JdbcWritableBridge.readString(10, __dbResults);
    this.START_TIME_ = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.END_TIME_ = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.DURATION_ = JdbcWritableBridge.readLong(13, __dbResults);
    this.TENANT_ID_ = JdbcWritableBridge.readString(14, __dbResults);
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
    JdbcWritableBridge.writeString(ID_, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PROC_DEF_ID_, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PROC_INST_ID_, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EXECUTION_ID_, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACT_ID_, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TASK_ID_, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CALL_PROC_INST_ID_, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACT_NAME_, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACT_TYPE_, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ASSIGNEE_, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(START_TIME_, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(END_TIME_, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(DURATION_, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(TENANT_ID_, 14 + __off, 12, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(ID_, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PROC_DEF_ID_, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PROC_INST_ID_, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EXECUTION_ID_, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACT_ID_, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TASK_ID_, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CALL_PROC_INST_ID_, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACT_NAME_, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ACT_TYPE_, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ASSIGNEE_, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(START_TIME_, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(END_TIME_, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(DURATION_, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(TENANT_ID_, 14 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.ID_ = null;
    } else {
    this.ID_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PROC_DEF_ID_ = null;
    } else {
    this.PROC_DEF_ID_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PROC_INST_ID_ = null;
    } else {
    this.PROC_INST_ID_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EXECUTION_ID_ = null;
    } else {
    this.EXECUTION_ID_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACT_ID_ = null;
    } else {
    this.ACT_ID_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TASK_ID_ = null;
    } else {
    this.TASK_ID_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CALL_PROC_INST_ID_ = null;
    } else {
    this.CALL_PROC_INST_ID_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACT_NAME_ = null;
    } else {
    this.ACT_NAME_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ACT_TYPE_ = null;
    } else {
    this.ACT_TYPE_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ASSIGNEE_ = null;
    } else {
    this.ASSIGNEE_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.START_TIME_ = null;
    } else {
    this.START_TIME_ = new Timestamp(__dataIn.readLong());
    this.START_TIME_.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.END_TIME_ = null;
    } else {
    this.END_TIME_ = new Timestamp(__dataIn.readLong());
    this.END_TIME_.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DURATION_ = null;
    } else {
    this.DURATION_ = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.TENANT_ID_ = null;
    } else {
    this.TENANT_ID_ = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ID_);
    }
    if (null == this.PROC_DEF_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PROC_DEF_ID_);
    }
    if (null == this.PROC_INST_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PROC_INST_ID_);
    }
    if (null == this.EXECUTION_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EXECUTION_ID_);
    }
    if (null == this.ACT_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACT_ID_);
    }
    if (null == this.TASK_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK_ID_);
    }
    if (null == this.CALL_PROC_INST_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CALL_PROC_INST_ID_);
    }
    if (null == this.ACT_NAME_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACT_NAME_);
    }
    if (null == this.ACT_TYPE_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACT_TYPE_);
    }
    if (null == this.ASSIGNEE_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ASSIGNEE_);
    }
    if (null == this.START_TIME_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.START_TIME_.getTime());
    __dataOut.writeInt(this.START_TIME_.getNanos());
    }
    if (null == this.END_TIME_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.END_TIME_.getTime());
    __dataOut.writeInt(this.END_TIME_.getNanos());
    }
    if (null == this.DURATION_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DURATION_);
    }
    if (null == this.TENANT_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TENANT_ID_);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ID_);
    }
    if (null == this.PROC_DEF_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PROC_DEF_ID_);
    }
    if (null == this.PROC_INST_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PROC_INST_ID_);
    }
    if (null == this.EXECUTION_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EXECUTION_ID_);
    }
    if (null == this.ACT_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACT_ID_);
    }
    if (null == this.TASK_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK_ID_);
    }
    if (null == this.CALL_PROC_INST_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CALL_PROC_INST_ID_);
    }
    if (null == this.ACT_NAME_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACT_NAME_);
    }
    if (null == this.ACT_TYPE_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ACT_TYPE_);
    }
    if (null == this.ASSIGNEE_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ASSIGNEE_);
    }
    if (null == this.START_TIME_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.START_TIME_.getTime());
    __dataOut.writeInt(this.START_TIME_.getNanos());
    }
    if (null == this.END_TIME_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.END_TIME_.getTime());
    __dataOut.writeInt(this.END_TIME_.getNanos());
    }
    if (null == this.DURATION_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.DURATION_);
    }
    if (null == this.TENANT_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TENANT_ID_);
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
    __sb.append(FieldFormatter.escapeAndEnclose(ID_==null?"null":ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PROC_DEF_ID_==null?"null":PROC_DEF_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PROC_INST_ID_==null?"null":PROC_INST_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXECUTION_ID_==null?"null":EXECUTION_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACT_ID_==null?"null":ACT_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK_ID_==null?"null":TASK_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CALL_PROC_INST_ID_==null?"null":CALL_PROC_INST_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACT_NAME_==null?"null":ACT_NAME_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACT_TYPE_==null?"null":ACT_TYPE_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ASSIGNEE_==null?"null":ASSIGNEE_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(START_TIME_==null?"null":"" + START_TIME_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(END_TIME_==null?"null":"" + END_TIME_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DURATION_==null?"null":"" + DURATION_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TENANT_ID_==null?"null":TENANT_ID_, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(ID_==null?"null":ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PROC_DEF_ID_==null?"null":PROC_DEF_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PROC_INST_ID_==null?"null":PROC_INST_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXECUTION_ID_==null?"null":EXECUTION_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACT_ID_==null?"null":ACT_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK_ID_==null?"null":TASK_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CALL_PROC_INST_ID_==null?"null":CALL_PROC_INST_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACT_NAME_==null?"null":ACT_NAME_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ACT_TYPE_==null?"null":ACT_TYPE_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ASSIGNEE_==null?"null":ASSIGNEE_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(START_TIME_==null?"null":"" + START_TIME_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(END_TIME_==null?"null":"" + END_TIME_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DURATION_==null?"null":"" + DURATION_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TENANT_ID_==null?"null":TENANT_ID_, delimiters));
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
    if (__cur_str.equals("null")) { this.ID_ = null; } else {
      this.ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PROC_DEF_ID_ = null; } else {
      this.PROC_DEF_ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PROC_INST_ID_ = null; } else {
      this.PROC_INST_ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EXECUTION_ID_ = null; } else {
      this.EXECUTION_ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ACT_ID_ = null; } else {
      this.ACT_ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK_ID_ = null; } else {
      this.TASK_ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CALL_PROC_INST_ID_ = null; } else {
      this.CALL_PROC_INST_ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ACT_NAME_ = null; } else {
      this.ACT_NAME_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ACT_TYPE_ = null; } else {
      this.ACT_TYPE_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ASSIGNEE_ = null; } else {
      this.ASSIGNEE_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.START_TIME_ = null; } else {
      this.START_TIME_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.END_TIME_ = null; } else {
      this.END_TIME_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DURATION_ = null; } else {
      this.DURATION_ = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TENANT_ID_ = null; } else {
      this.TENANT_ID_ = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ID_ = null; } else {
      this.ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PROC_DEF_ID_ = null; } else {
      this.PROC_DEF_ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PROC_INST_ID_ = null; } else {
      this.PROC_INST_ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EXECUTION_ID_ = null; } else {
      this.EXECUTION_ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ACT_ID_ = null; } else {
      this.ACT_ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TASK_ID_ = null; } else {
      this.TASK_ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CALL_PROC_INST_ID_ = null; } else {
      this.CALL_PROC_INST_ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ACT_NAME_ = null; } else {
      this.ACT_NAME_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ACT_TYPE_ = null; } else {
      this.ACT_TYPE_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ASSIGNEE_ = null; } else {
      this.ASSIGNEE_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.START_TIME_ = null; } else {
      this.START_TIME_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.END_TIME_ = null; } else {
      this.END_TIME_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DURATION_ = null; } else {
      this.DURATION_ = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TENANT_ID_ = null; } else {
      this.TENANT_ID_ = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    act_hi_actinst o = (act_hi_actinst) super.clone();
    o.START_TIME_ = (o.START_TIME_ != null) ? (java.sql.Timestamp) o.START_TIME_.clone() : null;
    o.END_TIME_ = (o.END_TIME_ != null) ? (java.sql.Timestamp) o.END_TIME_.clone() : null;
    return o;
  }

  public void clone0(act_hi_actinst o) throws CloneNotSupportedException {
    o.START_TIME_ = (o.START_TIME_ != null) ? (java.sql.Timestamp) o.START_TIME_.clone() : null;
    o.END_TIME_ = (o.END_TIME_ != null) ? (java.sql.Timestamp) o.END_TIME_.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("ID_", this.ID_);
    __sqoop$field_map.put("PROC_DEF_ID_", this.PROC_DEF_ID_);
    __sqoop$field_map.put("PROC_INST_ID_", this.PROC_INST_ID_);
    __sqoop$field_map.put("EXECUTION_ID_", this.EXECUTION_ID_);
    __sqoop$field_map.put("ACT_ID_", this.ACT_ID_);
    __sqoop$field_map.put("TASK_ID_", this.TASK_ID_);
    __sqoop$field_map.put("CALL_PROC_INST_ID_", this.CALL_PROC_INST_ID_);
    __sqoop$field_map.put("ACT_NAME_", this.ACT_NAME_);
    __sqoop$field_map.put("ACT_TYPE_", this.ACT_TYPE_);
    __sqoop$field_map.put("ASSIGNEE_", this.ASSIGNEE_);
    __sqoop$field_map.put("START_TIME_", this.START_TIME_);
    __sqoop$field_map.put("END_TIME_", this.END_TIME_);
    __sqoop$field_map.put("DURATION_", this.DURATION_);
    __sqoop$field_map.put("TENANT_ID_", this.TENANT_ID_);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("ID_", this.ID_);
    __sqoop$field_map.put("PROC_DEF_ID_", this.PROC_DEF_ID_);
    __sqoop$field_map.put("PROC_INST_ID_", this.PROC_INST_ID_);
    __sqoop$field_map.put("EXECUTION_ID_", this.EXECUTION_ID_);
    __sqoop$field_map.put("ACT_ID_", this.ACT_ID_);
    __sqoop$field_map.put("TASK_ID_", this.TASK_ID_);
    __sqoop$field_map.put("CALL_PROC_INST_ID_", this.CALL_PROC_INST_ID_);
    __sqoop$field_map.put("ACT_NAME_", this.ACT_NAME_);
    __sqoop$field_map.put("ACT_TYPE_", this.ACT_TYPE_);
    __sqoop$field_map.put("ASSIGNEE_", this.ASSIGNEE_);
    __sqoop$field_map.put("START_TIME_", this.START_TIME_);
    __sqoop$field_map.put("END_TIME_", this.END_TIME_);
    __sqoop$field_map.put("DURATION_", this.DURATION_);
    __sqoop$field_map.put("TENANT_ID_", this.TENANT_ID_);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("ID_".equals(__fieldName)) {
      this.ID_ = (String) __fieldVal;
    }
    else    if ("PROC_DEF_ID_".equals(__fieldName)) {
      this.PROC_DEF_ID_ = (String) __fieldVal;
    }
    else    if ("PROC_INST_ID_".equals(__fieldName)) {
      this.PROC_INST_ID_ = (String) __fieldVal;
    }
    else    if ("EXECUTION_ID_".equals(__fieldName)) {
      this.EXECUTION_ID_ = (String) __fieldVal;
    }
    else    if ("ACT_ID_".equals(__fieldName)) {
      this.ACT_ID_ = (String) __fieldVal;
    }
    else    if ("TASK_ID_".equals(__fieldName)) {
      this.TASK_ID_ = (String) __fieldVal;
    }
    else    if ("CALL_PROC_INST_ID_".equals(__fieldName)) {
      this.CALL_PROC_INST_ID_ = (String) __fieldVal;
    }
    else    if ("ACT_NAME_".equals(__fieldName)) {
      this.ACT_NAME_ = (String) __fieldVal;
    }
    else    if ("ACT_TYPE_".equals(__fieldName)) {
      this.ACT_TYPE_ = (String) __fieldVal;
    }
    else    if ("ASSIGNEE_".equals(__fieldName)) {
      this.ASSIGNEE_ = (String) __fieldVal;
    }
    else    if ("START_TIME_".equals(__fieldName)) {
      this.START_TIME_ = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("END_TIME_".equals(__fieldName)) {
      this.END_TIME_ = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("DURATION_".equals(__fieldName)) {
      this.DURATION_ = (Long) __fieldVal;
    }
    else    if ("TENANT_ID_".equals(__fieldName)) {
      this.TENANT_ID_ = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("ID_".equals(__fieldName)) {
      this.ID_ = (String) __fieldVal;
      return true;
    }
    else    if ("PROC_DEF_ID_".equals(__fieldName)) {
      this.PROC_DEF_ID_ = (String) __fieldVal;
      return true;
    }
    else    if ("PROC_INST_ID_".equals(__fieldName)) {
      this.PROC_INST_ID_ = (String) __fieldVal;
      return true;
    }
    else    if ("EXECUTION_ID_".equals(__fieldName)) {
      this.EXECUTION_ID_ = (String) __fieldVal;
      return true;
    }
    else    if ("ACT_ID_".equals(__fieldName)) {
      this.ACT_ID_ = (String) __fieldVal;
      return true;
    }
    else    if ("TASK_ID_".equals(__fieldName)) {
      this.TASK_ID_ = (String) __fieldVal;
      return true;
    }
    else    if ("CALL_PROC_INST_ID_".equals(__fieldName)) {
      this.CALL_PROC_INST_ID_ = (String) __fieldVal;
      return true;
    }
    else    if ("ACT_NAME_".equals(__fieldName)) {
      this.ACT_NAME_ = (String) __fieldVal;
      return true;
    }
    else    if ("ACT_TYPE_".equals(__fieldName)) {
      this.ACT_TYPE_ = (String) __fieldVal;
      return true;
    }
    else    if ("ASSIGNEE_".equals(__fieldName)) {
      this.ASSIGNEE_ = (String) __fieldVal;
      return true;
    }
    else    if ("START_TIME_".equals(__fieldName)) {
      this.START_TIME_ = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("END_TIME_".equals(__fieldName)) {
      this.END_TIME_ = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("DURATION_".equals(__fieldName)) {
      this.DURATION_ = (Long) __fieldVal;
      return true;
    }
    else    if ("TENANT_ID_".equals(__fieldName)) {
      this.TENANT_ID_ = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

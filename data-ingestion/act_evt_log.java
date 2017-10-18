// ORM class for table 'act_evt_log'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Oct 18 11:23:25 IST 2017
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

public class act_evt_log extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Long LOG_NR_;
  public Long get_LOG_NR_() {
    return LOG_NR_;
  }
  public void set_LOG_NR_(Long LOG_NR_) {
    this.LOG_NR_ = LOG_NR_;
  }
  public act_evt_log with_LOG_NR_(Long LOG_NR_) {
    this.LOG_NR_ = LOG_NR_;
    return this;
  }
  private String TYPE_;
  public String get_TYPE_() {
    return TYPE_;
  }
  public void set_TYPE_(String TYPE_) {
    this.TYPE_ = TYPE_;
  }
  public act_evt_log with_TYPE_(String TYPE_) {
    this.TYPE_ = TYPE_;
    return this;
  }
  private String PROC_DEF_ID_;
  public String get_PROC_DEF_ID_() {
    return PROC_DEF_ID_;
  }
  public void set_PROC_DEF_ID_(String PROC_DEF_ID_) {
    this.PROC_DEF_ID_ = PROC_DEF_ID_;
  }
  public act_evt_log with_PROC_DEF_ID_(String PROC_DEF_ID_) {
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
  public act_evt_log with_PROC_INST_ID_(String PROC_INST_ID_) {
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
  public act_evt_log with_EXECUTION_ID_(String EXECUTION_ID_) {
    this.EXECUTION_ID_ = EXECUTION_ID_;
    return this;
  }
  private String TASK_ID_;
  public String get_TASK_ID_() {
    return TASK_ID_;
  }
  public void set_TASK_ID_(String TASK_ID_) {
    this.TASK_ID_ = TASK_ID_;
  }
  public act_evt_log with_TASK_ID_(String TASK_ID_) {
    this.TASK_ID_ = TASK_ID_;
    return this;
  }
  private java.sql.Timestamp TIME_STAMP_;
  public java.sql.Timestamp get_TIME_STAMP_() {
    return TIME_STAMP_;
  }
  public void set_TIME_STAMP_(java.sql.Timestamp TIME_STAMP_) {
    this.TIME_STAMP_ = TIME_STAMP_;
  }
  public act_evt_log with_TIME_STAMP_(java.sql.Timestamp TIME_STAMP_) {
    this.TIME_STAMP_ = TIME_STAMP_;
    return this;
  }
  private String USER_ID_;
  public String get_USER_ID_() {
    return USER_ID_;
  }
  public void set_USER_ID_(String USER_ID_) {
    this.USER_ID_ = USER_ID_;
  }
  public act_evt_log with_USER_ID_(String USER_ID_) {
    this.USER_ID_ = USER_ID_;
    return this;
  }
  private com.cloudera.sqoop.lib.BlobRef DATA_;
  public com.cloudera.sqoop.lib.BlobRef get_DATA_() {
    return DATA_;
  }
  public void set_DATA_(com.cloudera.sqoop.lib.BlobRef DATA_) {
    this.DATA_ = DATA_;
  }
  public act_evt_log with_DATA_(com.cloudera.sqoop.lib.BlobRef DATA_) {
    this.DATA_ = DATA_;
    return this;
  }
  private String LOCK_OWNER_;
  public String get_LOCK_OWNER_() {
    return LOCK_OWNER_;
  }
  public void set_LOCK_OWNER_(String LOCK_OWNER_) {
    this.LOCK_OWNER_ = LOCK_OWNER_;
  }
  public act_evt_log with_LOCK_OWNER_(String LOCK_OWNER_) {
    this.LOCK_OWNER_ = LOCK_OWNER_;
    return this;
  }
  private java.sql.Timestamp LOCK_TIME_;
  public java.sql.Timestamp get_LOCK_TIME_() {
    return LOCK_TIME_;
  }
  public void set_LOCK_TIME_(java.sql.Timestamp LOCK_TIME_) {
    this.LOCK_TIME_ = LOCK_TIME_;
  }
  public act_evt_log with_LOCK_TIME_(java.sql.Timestamp LOCK_TIME_) {
    this.LOCK_TIME_ = LOCK_TIME_;
    return this;
  }
  private Integer IS_PROCESSED_;
  public Integer get_IS_PROCESSED_() {
    return IS_PROCESSED_;
  }
  public void set_IS_PROCESSED_(Integer IS_PROCESSED_) {
    this.IS_PROCESSED_ = IS_PROCESSED_;
  }
  public act_evt_log with_IS_PROCESSED_(Integer IS_PROCESSED_) {
    this.IS_PROCESSED_ = IS_PROCESSED_;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof act_evt_log)) {
      return false;
    }
    act_evt_log that = (act_evt_log) o;
    boolean equal = true;
    equal = equal && (this.LOG_NR_ == null ? that.LOG_NR_ == null : this.LOG_NR_.equals(that.LOG_NR_));
    equal = equal && (this.TYPE_ == null ? that.TYPE_ == null : this.TYPE_.equals(that.TYPE_));
    equal = equal && (this.PROC_DEF_ID_ == null ? that.PROC_DEF_ID_ == null : this.PROC_DEF_ID_.equals(that.PROC_DEF_ID_));
    equal = equal && (this.PROC_INST_ID_ == null ? that.PROC_INST_ID_ == null : this.PROC_INST_ID_.equals(that.PROC_INST_ID_));
    equal = equal && (this.EXECUTION_ID_ == null ? that.EXECUTION_ID_ == null : this.EXECUTION_ID_.equals(that.EXECUTION_ID_));
    equal = equal && (this.TASK_ID_ == null ? that.TASK_ID_ == null : this.TASK_ID_.equals(that.TASK_ID_));
    equal = equal && (this.TIME_STAMP_ == null ? that.TIME_STAMP_ == null : this.TIME_STAMP_.equals(that.TIME_STAMP_));
    equal = equal && (this.USER_ID_ == null ? that.USER_ID_ == null : this.USER_ID_.equals(that.USER_ID_));
    equal = equal && (this.DATA_ == null ? that.DATA_ == null : this.DATA_.equals(that.DATA_));
    equal = equal && (this.LOCK_OWNER_ == null ? that.LOCK_OWNER_ == null : this.LOCK_OWNER_.equals(that.LOCK_OWNER_));
    equal = equal && (this.LOCK_TIME_ == null ? that.LOCK_TIME_ == null : this.LOCK_TIME_.equals(that.LOCK_TIME_));
    equal = equal && (this.IS_PROCESSED_ == null ? that.IS_PROCESSED_ == null : this.IS_PROCESSED_.equals(that.IS_PROCESSED_));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof act_evt_log)) {
      return false;
    }
    act_evt_log that = (act_evt_log) o;
    boolean equal = true;
    equal = equal && (this.LOG_NR_ == null ? that.LOG_NR_ == null : this.LOG_NR_.equals(that.LOG_NR_));
    equal = equal && (this.TYPE_ == null ? that.TYPE_ == null : this.TYPE_.equals(that.TYPE_));
    equal = equal && (this.PROC_DEF_ID_ == null ? that.PROC_DEF_ID_ == null : this.PROC_DEF_ID_.equals(that.PROC_DEF_ID_));
    equal = equal && (this.PROC_INST_ID_ == null ? that.PROC_INST_ID_ == null : this.PROC_INST_ID_.equals(that.PROC_INST_ID_));
    equal = equal && (this.EXECUTION_ID_ == null ? that.EXECUTION_ID_ == null : this.EXECUTION_ID_.equals(that.EXECUTION_ID_));
    equal = equal && (this.TASK_ID_ == null ? that.TASK_ID_ == null : this.TASK_ID_.equals(that.TASK_ID_));
    equal = equal && (this.TIME_STAMP_ == null ? that.TIME_STAMP_ == null : this.TIME_STAMP_.equals(that.TIME_STAMP_));
    equal = equal && (this.USER_ID_ == null ? that.USER_ID_ == null : this.USER_ID_.equals(that.USER_ID_));
    equal = equal && (this.DATA_ == null ? that.DATA_ == null : this.DATA_.equals(that.DATA_));
    equal = equal && (this.LOCK_OWNER_ == null ? that.LOCK_OWNER_ == null : this.LOCK_OWNER_.equals(that.LOCK_OWNER_));
    equal = equal && (this.LOCK_TIME_ == null ? that.LOCK_TIME_ == null : this.LOCK_TIME_.equals(that.LOCK_TIME_));
    equal = equal && (this.IS_PROCESSED_ == null ? that.IS_PROCESSED_ == null : this.IS_PROCESSED_.equals(that.IS_PROCESSED_));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.LOG_NR_ = JdbcWritableBridge.readLong(1, __dbResults);
    this.TYPE_ = JdbcWritableBridge.readString(2, __dbResults);
    this.PROC_DEF_ID_ = JdbcWritableBridge.readString(3, __dbResults);
    this.PROC_INST_ID_ = JdbcWritableBridge.readString(4, __dbResults);
    this.EXECUTION_ID_ = JdbcWritableBridge.readString(5, __dbResults);
    this.TASK_ID_ = JdbcWritableBridge.readString(6, __dbResults);
    this.TIME_STAMP_ = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.USER_ID_ = JdbcWritableBridge.readString(8, __dbResults);
    this.DATA_ = JdbcWritableBridge.readBlobRef(9, __dbResults);
    this.LOCK_OWNER_ = JdbcWritableBridge.readString(10, __dbResults);
    this.LOCK_TIME_ = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.IS_PROCESSED_ = JdbcWritableBridge.readInteger(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.LOG_NR_ = JdbcWritableBridge.readLong(1, __dbResults);
    this.TYPE_ = JdbcWritableBridge.readString(2, __dbResults);
    this.PROC_DEF_ID_ = JdbcWritableBridge.readString(3, __dbResults);
    this.PROC_INST_ID_ = JdbcWritableBridge.readString(4, __dbResults);
    this.EXECUTION_ID_ = JdbcWritableBridge.readString(5, __dbResults);
    this.TASK_ID_ = JdbcWritableBridge.readString(6, __dbResults);
    this.TIME_STAMP_ = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.USER_ID_ = JdbcWritableBridge.readString(8, __dbResults);
    this.DATA_ = JdbcWritableBridge.readBlobRef(9, __dbResults);
    this.LOCK_OWNER_ = JdbcWritableBridge.readString(10, __dbResults);
    this.LOCK_TIME_ = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.IS_PROCESSED_ = JdbcWritableBridge.readInteger(12, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
    this.DATA_ = __loader.readBlobRef(9, this.__cur_result_set);
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
    this.DATA_ = __loader.readBlobRef(9, this.__cur_result_set);
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(LOG_NR_, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(TYPE_, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PROC_DEF_ID_, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PROC_INST_ID_, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EXECUTION_ID_, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TASK_ID_, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TIME_STAMP_, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(USER_ID_, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBlobRef(DATA_, 9 + __off, -4, __dbStmt);
    JdbcWritableBridge.writeString(LOCK_OWNER_, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOCK_TIME_, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(IS_PROCESSED_, 12 + __off, -6, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(LOG_NR_, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(TYPE_, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PROC_DEF_ID_, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PROC_INST_ID_, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EXECUTION_ID_, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(TASK_ID_, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(TIME_STAMP_, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(USER_ID_, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBlobRef(DATA_, 9 + __off, -4, __dbStmt);
    JdbcWritableBridge.writeString(LOCK_OWNER_, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(LOCK_TIME_, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(IS_PROCESSED_, 12 + __off, -6, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.LOG_NR_ = null;
    } else {
    this.LOG_NR_ = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.TYPE_ = null;
    } else {
    this.TYPE_ = Text.readString(__dataIn);
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
        this.TASK_ID_ = null;
    } else {
    this.TASK_ID_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TIME_STAMP_ = null;
    } else {
    this.TIME_STAMP_ = new Timestamp(__dataIn.readLong());
    this.TIME_STAMP_.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.USER_ID_ = null;
    } else {
    this.USER_ID_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DATA_ = null;
    } else {
    this.DATA_ = com.cloudera.sqoop.lib.LobSerializer.readBlobFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOCK_OWNER_ = null;
    } else {
    this.LOCK_OWNER_ = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOCK_TIME_ = null;
    } else {
    this.LOCK_TIME_ = new Timestamp(__dataIn.readLong());
    this.LOCK_TIME_.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.IS_PROCESSED_ = null;
    } else {
    this.IS_PROCESSED_ = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.LOG_NR_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.LOG_NR_);
    }
    if (null == this.TYPE_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TYPE_);
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
    if (null == this.TASK_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK_ID_);
    }
    if (null == this.TIME_STAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TIME_STAMP_.getTime());
    __dataOut.writeInt(this.TIME_STAMP_.getNanos());
    }
    if (null == this.USER_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, USER_ID_);
    }
    if (null == this.DATA_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeBlob(this.DATA_, __dataOut);
    }
    if (null == this.LOCK_OWNER_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOCK_OWNER_);
    }
    if (null == this.LOCK_TIME_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.LOCK_TIME_.getTime());
    __dataOut.writeInt(this.LOCK_TIME_.getNanos());
    }
    if (null == this.IS_PROCESSED_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.IS_PROCESSED_);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.LOG_NR_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.LOG_NR_);
    }
    if (null == this.TYPE_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TYPE_);
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
    if (null == this.TASK_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, TASK_ID_);
    }
    if (null == this.TIME_STAMP_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.TIME_STAMP_.getTime());
    __dataOut.writeInt(this.TIME_STAMP_.getNanos());
    }
    if (null == this.USER_ID_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, USER_ID_);
    }
    if (null == this.DATA_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.LobSerializer.writeBlob(this.DATA_, __dataOut);
    }
    if (null == this.LOCK_OWNER_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOCK_OWNER_);
    }
    if (null == this.LOCK_TIME_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.LOCK_TIME_.getTime());
    __dataOut.writeInt(this.LOCK_TIME_.getNanos());
    }
    if (null == this.IS_PROCESSED_) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.IS_PROCESSED_);
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
    __sb.append(FieldFormatter.escapeAndEnclose(LOG_NR_==null?"null":"" + LOG_NR_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TYPE_==null?"null":TYPE_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PROC_DEF_ID_==null?"null":PROC_DEF_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PROC_INST_ID_==null?"null":PROC_INST_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXECUTION_ID_==null?"null":EXECUTION_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK_ID_==null?"null":TASK_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TIME_STAMP_==null?"null":"" + TIME_STAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(USER_ID_==null?"null":USER_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_==null?"null":"" + DATA_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOCK_OWNER_==null?"null":LOCK_OWNER_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOCK_TIME_==null?"null":"" + LOCK_TIME_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IS_PROCESSED_==null?"null":"" + IS_PROCESSED_, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(LOG_NR_==null?"null":"" + LOG_NR_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TYPE_==null?"null":TYPE_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PROC_DEF_ID_==null?"null":PROC_DEF_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PROC_INST_ID_==null?"null":PROC_INST_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXECUTION_ID_==null?"null":EXECUTION_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TASK_ID_==null?"null":TASK_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TIME_STAMP_==null?"null":"" + TIME_STAMP_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(USER_ID_==null?"null":USER_ID_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DATA_==null?"null":"" + DATA_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOCK_OWNER_==null?"null":LOCK_OWNER_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOCK_TIME_==null?"null":"" + LOCK_TIME_, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(IS_PROCESSED_==null?"null":"" + IS_PROCESSED_, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOG_NR_ = null; } else {
      this.LOG_NR_ = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TYPE_ = null; } else {
      this.TYPE_ = __cur_str;
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
    if (__cur_str.equals("null")) { this.TASK_ID_ = null; } else {
      this.TASK_ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TIME_STAMP_ = null; } else {
      this.TIME_STAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.USER_ID_ = null; } else {
      this.USER_ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATA_ = null; } else {
      this.DATA_ = BlobRef.parse(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LOCK_OWNER_ = null; } else {
      this.LOCK_OWNER_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOCK_TIME_ = null; } else {
      this.LOCK_TIME_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.IS_PROCESSED_ = null; } else {
      this.IS_PROCESSED_ = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOG_NR_ = null; } else {
      this.LOG_NR_ = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.TYPE_ = null; } else {
      this.TYPE_ = __cur_str;
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
    if (__cur_str.equals("null")) { this.TASK_ID_ = null; } else {
      this.TASK_ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TIME_STAMP_ = null; } else {
      this.TIME_STAMP_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.USER_ID_ = null; } else {
      this.USER_ID_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DATA_ = null; } else {
      this.DATA_ = BlobRef.parse(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LOCK_OWNER_ = null; } else {
      this.LOCK_OWNER_ = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.LOCK_TIME_ = null; } else {
      this.LOCK_TIME_ = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.IS_PROCESSED_ = null; } else {
      this.IS_PROCESSED_ = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    act_evt_log o = (act_evt_log) super.clone();
    o.TIME_STAMP_ = (o.TIME_STAMP_ != null) ? (java.sql.Timestamp) o.TIME_STAMP_.clone() : null;
    o.DATA_ = (o.DATA_ != null) ? (com.cloudera.sqoop.lib.BlobRef) o.DATA_.clone() : null;
    o.LOCK_TIME_ = (o.LOCK_TIME_ != null) ? (java.sql.Timestamp) o.LOCK_TIME_.clone() : null;
    return o;
  }

  public void clone0(act_evt_log o) throws CloneNotSupportedException {
    o.TIME_STAMP_ = (o.TIME_STAMP_ != null) ? (java.sql.Timestamp) o.TIME_STAMP_.clone() : null;
    o.DATA_ = (o.DATA_ != null) ? (com.cloudera.sqoop.lib.BlobRef) o.DATA_.clone() : null;
    o.LOCK_TIME_ = (o.LOCK_TIME_ != null) ? (java.sql.Timestamp) o.LOCK_TIME_.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("LOG_NR_", this.LOG_NR_);
    __sqoop$field_map.put("TYPE_", this.TYPE_);
    __sqoop$field_map.put("PROC_DEF_ID_", this.PROC_DEF_ID_);
    __sqoop$field_map.put("PROC_INST_ID_", this.PROC_INST_ID_);
    __sqoop$field_map.put("EXECUTION_ID_", this.EXECUTION_ID_);
    __sqoop$field_map.put("TASK_ID_", this.TASK_ID_);
    __sqoop$field_map.put("TIME_STAMP_", this.TIME_STAMP_);
    __sqoop$field_map.put("USER_ID_", this.USER_ID_);
    __sqoop$field_map.put("DATA_", this.DATA_);
    __sqoop$field_map.put("LOCK_OWNER_", this.LOCK_OWNER_);
    __sqoop$field_map.put("LOCK_TIME_", this.LOCK_TIME_);
    __sqoop$field_map.put("IS_PROCESSED_", this.IS_PROCESSED_);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("LOG_NR_", this.LOG_NR_);
    __sqoop$field_map.put("TYPE_", this.TYPE_);
    __sqoop$field_map.put("PROC_DEF_ID_", this.PROC_DEF_ID_);
    __sqoop$field_map.put("PROC_INST_ID_", this.PROC_INST_ID_);
    __sqoop$field_map.put("EXECUTION_ID_", this.EXECUTION_ID_);
    __sqoop$field_map.put("TASK_ID_", this.TASK_ID_);
    __sqoop$field_map.put("TIME_STAMP_", this.TIME_STAMP_);
    __sqoop$field_map.put("USER_ID_", this.USER_ID_);
    __sqoop$field_map.put("DATA_", this.DATA_);
    __sqoop$field_map.put("LOCK_OWNER_", this.LOCK_OWNER_);
    __sqoop$field_map.put("LOCK_TIME_", this.LOCK_TIME_);
    __sqoop$field_map.put("IS_PROCESSED_", this.IS_PROCESSED_);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("LOG_NR_".equals(__fieldName)) {
      this.LOG_NR_ = (Long) __fieldVal;
    }
    else    if ("TYPE_".equals(__fieldName)) {
      this.TYPE_ = (String) __fieldVal;
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
    else    if ("TASK_ID_".equals(__fieldName)) {
      this.TASK_ID_ = (String) __fieldVal;
    }
    else    if ("TIME_STAMP_".equals(__fieldName)) {
      this.TIME_STAMP_ = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("USER_ID_".equals(__fieldName)) {
      this.USER_ID_ = (String) __fieldVal;
    }
    else    if ("DATA_".equals(__fieldName)) {
      this.DATA_ = (com.cloudera.sqoop.lib.BlobRef) __fieldVal;
    }
    else    if ("LOCK_OWNER_".equals(__fieldName)) {
      this.LOCK_OWNER_ = (String) __fieldVal;
    }
    else    if ("LOCK_TIME_".equals(__fieldName)) {
      this.LOCK_TIME_ = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("IS_PROCESSED_".equals(__fieldName)) {
      this.IS_PROCESSED_ = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("LOG_NR_".equals(__fieldName)) {
      this.LOG_NR_ = (Long) __fieldVal;
      return true;
    }
    else    if ("TYPE_".equals(__fieldName)) {
      this.TYPE_ = (String) __fieldVal;
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
    else    if ("TASK_ID_".equals(__fieldName)) {
      this.TASK_ID_ = (String) __fieldVal;
      return true;
    }
    else    if ("TIME_STAMP_".equals(__fieldName)) {
      this.TIME_STAMP_ = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("USER_ID_".equals(__fieldName)) {
      this.USER_ID_ = (String) __fieldVal;
      return true;
    }
    else    if ("DATA_".equals(__fieldName)) {
      this.DATA_ = (com.cloudera.sqoop.lib.BlobRef) __fieldVal;
      return true;
    }
    else    if ("LOCK_OWNER_".equals(__fieldName)) {
      this.LOCK_OWNER_ = (String) __fieldVal;
      return true;
    }
    else    if ("LOCK_TIME_".equals(__fieldName)) {
      this.LOCK_TIME_ = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("IS_PROCESSED_".equals(__fieldName)) {
      this.IS_PROCESSED_ = (Integer) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

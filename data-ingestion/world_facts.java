// ORM class for table 'world_facts'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Oct 17 18:03:21 IST 2017
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

public class world_facts extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String continent_name;
  public String get_continent_name() {
    return continent_name;
  }
  public void set_continent_name(String continent_name) {
    this.continent_name = continent_name;
  }
  public world_facts with_continent_name(String continent_name) {
    this.continent_name = continent_name;
    return this;
  }
  private String continent_code;
  public String get_continent_code() {
    return continent_code;
  }
  public void set_continent_code(String continent_code) {
    this.continent_code = continent_code;
  }
  public world_facts with_continent_code(String continent_code) {
    this.continent_code = continent_code;
    return this;
  }
  private String country_name;
  public String get_country_name() {
    return country_name;
  }
  public void set_country_name(String country_name) {
    this.country_name = country_name;
  }
  public world_facts with_country_name(String country_name) {
    this.country_name = country_name;
    return this;
  }
  private String country_code;
  public String get_country_code() {
    return country_code;
  }
  public void set_country_code(String country_code) {
    this.country_code = country_code;
  }
  public world_facts with_country_code(String country_code) {
    this.country_code = country_code;
    return this;
  }
  private Integer year;
  public Integer get_year() {
    return year;
  }
  public void set_year(Integer year) {
    this.year = year;
  }
  public world_facts with_year(Integer year) {
    this.year = year;
    return this;
  }
  private Long population;
  public Long get_population() {
    return population;
  }
  public void set_population(Long population) {
    this.population = population;
  }
  public world_facts with_population(Long population) {
    this.population = population;
    return this;
  }
  private Long population_increase;
  public Long get_population_increase() {
    return population_increase;
  }
  public void set_population_increase(Long population_increase) {
    this.population_increase = population_increase;
  }
  public world_facts with_population_increase(Long population_increase) {
    this.population_increase = population_increase;
    return this;
  }
  private Double abs_growth;
  public Double get_abs_growth() {
    return abs_growth;
  }
  public void set_abs_growth(Double abs_growth) {
    this.abs_growth = abs_growth;
  }
  public world_facts with_abs_growth(Double abs_growth) {
    this.abs_growth = abs_growth;
    return this;
  }
  private java.math.BigDecimal curr_growth;
  public java.math.BigDecimal get_curr_growth() {
    return curr_growth;
  }
  public void set_curr_growth(java.math.BigDecimal curr_growth) {
    this.curr_growth = curr_growth;
  }
  public world_facts with_curr_growth(java.math.BigDecimal curr_growth) {
    this.curr_growth = curr_growth;
    return this;
  }
  private java.math.BigDecimal cell_phone_usage;
  public java.math.BigDecimal get_cell_phone_usage() {
    return cell_phone_usage;
  }
  public void set_cell_phone_usage(java.math.BigDecimal cell_phone_usage) {
    this.cell_phone_usage = cell_phone_usage;
  }
  public world_facts with_cell_phone_usage(java.math.BigDecimal cell_phone_usage) {
    this.cell_phone_usage = cell_phone_usage;
    return this;
  }
  private java.math.BigDecimal co2_emission_rate;
  public java.math.BigDecimal get_co2_emission_rate() {
    return co2_emission_rate;
  }
  public void set_co2_emission_rate(java.math.BigDecimal co2_emission_rate) {
    this.co2_emission_rate = co2_emission_rate;
  }
  public world_facts with_co2_emission_rate(java.math.BigDecimal co2_emission_rate) {
    this.co2_emission_rate = co2_emission_rate;
    return this;
  }
  private java.math.BigDecimal life_expetency;
  public java.math.BigDecimal get_life_expetency() {
    return life_expetency;
  }
  public void set_life_expetency(java.math.BigDecimal life_expetency) {
    this.life_expetency = life_expetency;
  }
  public world_facts with_life_expetency(java.math.BigDecimal life_expetency) {
    this.life_expetency = life_expetency;
    return this;
  }
  private java.math.BigDecimal hiv_infection_rate;
  public java.math.BigDecimal get_hiv_infection_rate() {
    return hiv_infection_rate;
  }
  public void set_hiv_infection_rate(java.math.BigDecimal hiv_infection_rate) {
    this.hiv_infection_rate = hiv_infection_rate;
  }
  public world_facts with_hiv_infection_rate(java.math.BigDecimal hiv_infection_rate) {
    this.hiv_infection_rate = hiv_infection_rate;
    return this;
  }
  private java.math.BigDecimal cell_phone_usage_rate;
  public java.math.BigDecimal get_cell_phone_usage_rate() {
    return cell_phone_usage_rate;
  }
  public void set_cell_phone_usage_rate(java.math.BigDecimal cell_phone_usage_rate) {
    this.cell_phone_usage_rate = cell_phone_usage_rate;
  }
  public world_facts with_cell_phone_usage_rate(java.math.BigDecimal cell_phone_usage_rate) {
    this.cell_phone_usage_rate = cell_phone_usage_rate;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof world_facts)) {
      return false;
    }
    world_facts that = (world_facts) o;
    boolean equal = true;
    equal = equal && (this.continent_name == null ? that.continent_name == null : this.continent_name.equals(that.continent_name));
    equal = equal && (this.continent_code == null ? that.continent_code == null : this.continent_code.equals(that.continent_code));
    equal = equal && (this.country_name == null ? that.country_name == null : this.country_name.equals(that.country_name));
    equal = equal && (this.country_code == null ? that.country_code == null : this.country_code.equals(that.country_code));
    equal = equal && (this.year == null ? that.year == null : this.year.equals(that.year));
    equal = equal && (this.population == null ? that.population == null : this.population.equals(that.population));
    equal = equal && (this.population_increase == null ? that.population_increase == null : this.population_increase.equals(that.population_increase));
    equal = equal && (this.abs_growth == null ? that.abs_growth == null : this.abs_growth.equals(that.abs_growth));
    equal = equal && (this.curr_growth == null ? that.curr_growth == null : this.curr_growth.equals(that.curr_growth));
    equal = equal && (this.cell_phone_usage == null ? that.cell_phone_usage == null : this.cell_phone_usage.equals(that.cell_phone_usage));
    equal = equal && (this.co2_emission_rate == null ? that.co2_emission_rate == null : this.co2_emission_rate.equals(that.co2_emission_rate));
    equal = equal && (this.life_expetency == null ? that.life_expetency == null : this.life_expetency.equals(that.life_expetency));
    equal = equal && (this.hiv_infection_rate == null ? that.hiv_infection_rate == null : this.hiv_infection_rate.equals(that.hiv_infection_rate));
    equal = equal && (this.cell_phone_usage_rate == null ? that.cell_phone_usage_rate == null : this.cell_phone_usage_rate.equals(that.cell_phone_usage_rate));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof world_facts)) {
      return false;
    }
    world_facts that = (world_facts) o;
    boolean equal = true;
    equal = equal && (this.continent_name == null ? that.continent_name == null : this.continent_name.equals(that.continent_name));
    equal = equal && (this.continent_code == null ? that.continent_code == null : this.continent_code.equals(that.continent_code));
    equal = equal && (this.country_name == null ? that.country_name == null : this.country_name.equals(that.country_name));
    equal = equal && (this.country_code == null ? that.country_code == null : this.country_code.equals(that.country_code));
    equal = equal && (this.year == null ? that.year == null : this.year.equals(that.year));
    equal = equal && (this.population == null ? that.population == null : this.population.equals(that.population));
    equal = equal && (this.population_increase == null ? that.population_increase == null : this.population_increase.equals(that.population_increase));
    equal = equal && (this.abs_growth == null ? that.abs_growth == null : this.abs_growth.equals(that.abs_growth));
    equal = equal && (this.curr_growth == null ? that.curr_growth == null : this.curr_growth.equals(that.curr_growth));
    equal = equal && (this.cell_phone_usage == null ? that.cell_phone_usage == null : this.cell_phone_usage.equals(that.cell_phone_usage));
    equal = equal && (this.co2_emission_rate == null ? that.co2_emission_rate == null : this.co2_emission_rate.equals(that.co2_emission_rate));
    equal = equal && (this.life_expetency == null ? that.life_expetency == null : this.life_expetency.equals(that.life_expetency));
    equal = equal && (this.hiv_infection_rate == null ? that.hiv_infection_rate == null : this.hiv_infection_rate.equals(that.hiv_infection_rate));
    equal = equal && (this.cell_phone_usage_rate == null ? that.cell_phone_usage_rate == null : this.cell_phone_usage_rate.equals(that.cell_phone_usage_rate));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.continent_name = JdbcWritableBridge.readString(1, __dbResults);
    this.continent_code = JdbcWritableBridge.readString(2, __dbResults);
    this.country_name = JdbcWritableBridge.readString(3, __dbResults);
    this.country_code = JdbcWritableBridge.readString(4, __dbResults);
    this.year = JdbcWritableBridge.readInteger(5, __dbResults);
    this.population = JdbcWritableBridge.readLong(6, __dbResults);
    this.population_increase = JdbcWritableBridge.readLong(7, __dbResults);
    this.abs_growth = JdbcWritableBridge.readDouble(8, __dbResults);
    this.curr_growth = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.cell_phone_usage = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.co2_emission_rate = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.life_expetency = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.hiv_infection_rate = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.cell_phone_usage_rate = JdbcWritableBridge.readBigDecimal(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.continent_name = JdbcWritableBridge.readString(1, __dbResults);
    this.continent_code = JdbcWritableBridge.readString(2, __dbResults);
    this.country_name = JdbcWritableBridge.readString(3, __dbResults);
    this.country_code = JdbcWritableBridge.readString(4, __dbResults);
    this.year = JdbcWritableBridge.readInteger(5, __dbResults);
    this.population = JdbcWritableBridge.readLong(6, __dbResults);
    this.population_increase = JdbcWritableBridge.readLong(7, __dbResults);
    this.abs_growth = JdbcWritableBridge.readDouble(8, __dbResults);
    this.curr_growth = JdbcWritableBridge.readBigDecimal(9, __dbResults);
    this.cell_phone_usage = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.co2_emission_rate = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.life_expetency = JdbcWritableBridge.readBigDecimal(12, __dbResults);
    this.hiv_infection_rate = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.cell_phone_usage_rate = JdbcWritableBridge.readBigDecimal(14, __dbResults);
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
    JdbcWritableBridge.writeString(continent_name, 1 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(continent_code, 2 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(country_name, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(country_code, 4 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(year, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(population, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(population_increase, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(abs_growth, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(curr_growth, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(cell_phone_usage, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(co2_emission_rate, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(life_expetency, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(hiv_infection_rate, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(cell_phone_usage_rate, 14 + __off, 3, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(continent_name, 1 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(continent_code, 2 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(country_name, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(country_code, 4 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeInteger(year, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(population, 6 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(population_increase, 7 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(abs_growth, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(curr_growth, 9 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(cell_phone_usage, 10 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(co2_emission_rate, 11 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(life_expetency, 12 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(hiv_infection_rate, 13 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(cell_phone_usage_rate, 14 + __off, 3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.continent_name = null;
    } else {
    this.continent_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.continent_code = null;
    } else {
    this.continent_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.country_name = null;
    } else {
    this.country_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.country_code = null;
    } else {
    this.country_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.year = null;
    } else {
    this.year = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.population = null;
    } else {
    this.population = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.population_increase = null;
    } else {
    this.population_increase = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.abs_growth = null;
    } else {
    this.abs_growth = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.curr_growth = null;
    } else {
    this.curr_growth = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cell_phone_usage = null;
    } else {
    this.cell_phone_usage = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.co2_emission_rate = null;
    } else {
    this.co2_emission_rate = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.life_expetency = null;
    } else {
    this.life_expetency = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hiv_infection_rate = null;
    } else {
    this.hiv_infection_rate = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cell_phone_usage_rate = null;
    } else {
    this.cell_phone_usage_rate = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.continent_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, continent_name);
    }
    if (null == this.continent_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, continent_code);
    }
    if (null == this.country_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country_name);
    }
    if (null == this.country_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country_code);
    }
    if (null == this.year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.year);
    }
    if (null == this.population) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.population);
    }
    if (null == this.population_increase) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.population_increase);
    }
    if (null == this.abs_growth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.abs_growth);
    }
    if (null == this.curr_growth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.curr_growth, __dataOut);
    }
    if (null == this.cell_phone_usage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.cell_phone_usage, __dataOut);
    }
    if (null == this.co2_emission_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.co2_emission_rate, __dataOut);
    }
    if (null == this.life_expetency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.life_expetency, __dataOut);
    }
    if (null == this.hiv_infection_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.hiv_infection_rate, __dataOut);
    }
    if (null == this.cell_phone_usage_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.cell_phone_usage_rate, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.continent_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, continent_name);
    }
    if (null == this.continent_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, continent_code);
    }
    if (null == this.country_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country_name);
    }
    if (null == this.country_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country_code);
    }
    if (null == this.year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.year);
    }
    if (null == this.population) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.population);
    }
    if (null == this.population_increase) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.population_increase);
    }
    if (null == this.abs_growth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.abs_growth);
    }
    if (null == this.curr_growth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.curr_growth, __dataOut);
    }
    if (null == this.cell_phone_usage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.cell_phone_usage, __dataOut);
    }
    if (null == this.co2_emission_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.co2_emission_rate, __dataOut);
    }
    if (null == this.life_expetency) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.life_expetency, __dataOut);
    }
    if (null == this.hiv_infection_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.hiv_infection_rate, __dataOut);
    }
    if (null == this.cell_phone_usage_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.cell_phone_usage_rate, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(continent_name==null?"null":continent_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(continent_code==null?"null":continent_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country_name==null?"null":country_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country_code==null?"null":country_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(year==null?"null":"" + year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(population==null?"null":"" + population, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(population_increase==null?"null":"" + population_increase, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(abs_growth==null?"null":"" + abs_growth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(curr_growth==null?"null":curr_growth.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cell_phone_usage==null?"null":cell_phone_usage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(co2_emission_rate==null?"null":co2_emission_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(life_expetency==null?"null":life_expetency.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hiv_infection_rate==null?"null":hiv_infection_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cell_phone_usage_rate==null?"null":cell_phone_usage_rate.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(continent_name==null?"null":continent_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(continent_code==null?"null":continent_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country_name==null?"null":country_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country_code==null?"null":country_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(year==null?"null":"" + year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(population==null?"null":"" + population, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(population_increase==null?"null":"" + population_increase, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(abs_growth==null?"null":"" + abs_growth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(curr_growth==null?"null":curr_growth.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cell_phone_usage==null?"null":cell_phone_usage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(co2_emission_rate==null?"null":co2_emission_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(life_expetency==null?"null":life_expetency.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hiv_infection_rate==null?"null":hiv_infection_rate.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cell_phone_usage_rate==null?"null":cell_phone_usage_rate.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.continent_name = null; } else {
      this.continent_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.continent_code = null; } else {
      this.continent_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.country_name = null; } else {
      this.country_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.country_code = null; } else {
      this.country_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.year = null; } else {
      this.year = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.population = null; } else {
      this.population = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.population_increase = null; } else {
      this.population_increase = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.abs_growth = null; } else {
      this.abs_growth = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.curr_growth = null; } else {
      this.curr_growth = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cell_phone_usage = null; } else {
      this.cell_phone_usage = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.co2_emission_rate = null; } else {
      this.co2_emission_rate = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.life_expetency = null; } else {
      this.life_expetency = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hiv_infection_rate = null; } else {
      this.hiv_infection_rate = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cell_phone_usage_rate = null; } else {
      this.cell_phone_usage_rate = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.continent_name = null; } else {
      this.continent_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.continent_code = null; } else {
      this.continent_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.country_name = null; } else {
      this.country_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.country_code = null; } else {
      this.country_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.year = null; } else {
      this.year = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.population = null; } else {
      this.population = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.population_increase = null; } else {
      this.population_increase = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.abs_growth = null; } else {
      this.abs_growth = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.curr_growth = null; } else {
      this.curr_growth = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cell_phone_usage = null; } else {
      this.cell_phone_usage = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.co2_emission_rate = null; } else {
      this.co2_emission_rate = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.life_expetency = null; } else {
      this.life_expetency = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hiv_infection_rate = null; } else {
      this.hiv_infection_rate = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cell_phone_usage_rate = null; } else {
      this.cell_phone_usage_rate = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    world_facts o = (world_facts) super.clone();
    return o;
  }

  public void clone0(world_facts o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("continent_name", this.continent_name);
    __sqoop$field_map.put("continent_code", this.continent_code);
    __sqoop$field_map.put("country_name", this.country_name);
    __sqoop$field_map.put("country_code", this.country_code);
    __sqoop$field_map.put("year", this.year);
    __sqoop$field_map.put("population", this.population);
    __sqoop$field_map.put("population_increase", this.population_increase);
    __sqoop$field_map.put("abs_growth", this.abs_growth);
    __sqoop$field_map.put("curr_growth", this.curr_growth);
    __sqoop$field_map.put("cell_phone_usage", this.cell_phone_usage);
    __sqoop$field_map.put("co2_emission_rate", this.co2_emission_rate);
    __sqoop$field_map.put("life_expetency", this.life_expetency);
    __sqoop$field_map.put("hiv_infection_rate", this.hiv_infection_rate);
    __sqoop$field_map.put("cell_phone_usage_rate", this.cell_phone_usage_rate);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("continent_name", this.continent_name);
    __sqoop$field_map.put("continent_code", this.continent_code);
    __sqoop$field_map.put("country_name", this.country_name);
    __sqoop$field_map.put("country_code", this.country_code);
    __sqoop$field_map.put("year", this.year);
    __sqoop$field_map.put("population", this.population);
    __sqoop$field_map.put("population_increase", this.population_increase);
    __sqoop$field_map.put("abs_growth", this.abs_growth);
    __sqoop$field_map.put("curr_growth", this.curr_growth);
    __sqoop$field_map.put("cell_phone_usage", this.cell_phone_usage);
    __sqoop$field_map.put("co2_emission_rate", this.co2_emission_rate);
    __sqoop$field_map.put("life_expetency", this.life_expetency);
    __sqoop$field_map.put("hiv_infection_rate", this.hiv_infection_rate);
    __sqoop$field_map.put("cell_phone_usage_rate", this.cell_phone_usage_rate);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("continent_name".equals(__fieldName)) {
      this.continent_name = (String) __fieldVal;
    }
    else    if ("continent_code".equals(__fieldName)) {
      this.continent_code = (String) __fieldVal;
    }
    else    if ("country_name".equals(__fieldName)) {
      this.country_name = (String) __fieldVal;
    }
    else    if ("country_code".equals(__fieldName)) {
      this.country_code = (String) __fieldVal;
    }
    else    if ("year".equals(__fieldName)) {
      this.year = (Integer) __fieldVal;
    }
    else    if ("population".equals(__fieldName)) {
      this.population = (Long) __fieldVal;
    }
    else    if ("population_increase".equals(__fieldName)) {
      this.population_increase = (Long) __fieldVal;
    }
    else    if ("abs_growth".equals(__fieldName)) {
      this.abs_growth = (Double) __fieldVal;
    }
    else    if ("curr_growth".equals(__fieldName)) {
      this.curr_growth = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("cell_phone_usage".equals(__fieldName)) {
      this.cell_phone_usage = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("co2_emission_rate".equals(__fieldName)) {
      this.co2_emission_rate = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("life_expetency".equals(__fieldName)) {
      this.life_expetency = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("hiv_infection_rate".equals(__fieldName)) {
      this.hiv_infection_rate = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("cell_phone_usage_rate".equals(__fieldName)) {
      this.cell_phone_usage_rate = (java.math.BigDecimal) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("continent_name".equals(__fieldName)) {
      this.continent_name = (String) __fieldVal;
      return true;
    }
    else    if ("continent_code".equals(__fieldName)) {
      this.continent_code = (String) __fieldVal;
      return true;
    }
    else    if ("country_name".equals(__fieldName)) {
      this.country_name = (String) __fieldVal;
      return true;
    }
    else    if ("country_code".equals(__fieldName)) {
      this.country_code = (String) __fieldVal;
      return true;
    }
    else    if ("year".equals(__fieldName)) {
      this.year = (Integer) __fieldVal;
      return true;
    }
    else    if ("population".equals(__fieldName)) {
      this.population = (Long) __fieldVal;
      return true;
    }
    else    if ("population_increase".equals(__fieldName)) {
      this.population_increase = (Long) __fieldVal;
      return true;
    }
    else    if ("abs_growth".equals(__fieldName)) {
      this.abs_growth = (Double) __fieldVal;
      return true;
    }
    else    if ("curr_growth".equals(__fieldName)) {
      this.curr_growth = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("cell_phone_usage".equals(__fieldName)) {
      this.cell_phone_usage = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("co2_emission_rate".equals(__fieldName)) {
      this.co2_emission_rate = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("life_expetency".equals(__fieldName)) {
      this.life_expetency = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("hiv_infection_rate".equals(__fieldName)) {
      this.hiv_infection_rate = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("cell_phone_usage_rate".equals(__fieldName)) {
      this.cell_phone_usage_rate = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}

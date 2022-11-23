/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package br.com.egois.schemaregistry.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Transacao extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4167087903139360333L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Transacao\",\"namespace\":\"br.com.egois.schemaregistry.avro\",\"fields\":[{\"name\":\"key\",\"type\":\"string\",\"doc\":\"Chave\"},{\"name\":\"nome\",\"type\":\"string\",\"doc\":\"Nome\"},{\"name\":\"documento\",\"type\":\"string\",\"doc\":\"Documento\"},{\"name\":\"situacao\",\"type\":\"boolean\",\"doc\":\"Situacao\",\"default\":false}],\"version\":\"1\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Transacao> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Transacao> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Transacao> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Transacao> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Transacao> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Transacao to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Transacao from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Transacao instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Transacao fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Chave */
  private java.lang.CharSequence key;
  /** Nome */
  private java.lang.CharSequence nome;
  /** Documento */
  private java.lang.CharSequence documento;
  /** Situacao */
  private boolean situacao;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Transacao() {}

  /**
   * All-args constructor.
   * @param key Chave
   * @param nome Nome
   * @param documento Documento
   * @param situacao Situacao
   */
  public Transacao(java.lang.CharSequence key, java.lang.CharSequence nome, java.lang.CharSequence documento, java.lang.Boolean situacao) {
    this.key = key;
    this.nome = nome;
    this.documento = documento;
    this.situacao = situacao;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return key;
    case 1: return nome;
    case 2: return documento;
    case 3: return situacao;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: key = (java.lang.CharSequence)value$; break;
    case 1: nome = (java.lang.CharSequence)value$; break;
    case 2: documento = (java.lang.CharSequence)value$; break;
    case 3: situacao = (java.lang.Boolean)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'key' field.
   * @return Chave
   */
  public java.lang.CharSequence getKey() {
    return key;
  }


  /**
   * Sets the value of the 'key' field.
   * Chave
   * @param value the value to set.
   */
  public void setKey(java.lang.CharSequence value) {
    this.key = value;
  }

  /**
   * Gets the value of the 'nome' field.
   * @return Nome
   */
  public java.lang.CharSequence getNome() {
    return nome;
  }


  /**
   * Sets the value of the 'nome' field.
   * Nome
   * @param value the value to set.
   */
  public void setNome(java.lang.CharSequence value) {
    this.nome = value;
  }

  /**
   * Gets the value of the 'documento' field.
   * @return Documento
   */
  public java.lang.CharSequence getDocumento() {
    return documento;
  }


  /**
   * Sets the value of the 'documento' field.
   * Documento
   * @param value the value to set.
   */
  public void setDocumento(java.lang.CharSequence value) {
    this.documento = value;
  }

  /**
   * Gets the value of the 'situacao' field.
   * @return Situacao
   */
  public boolean getSituacao() {
    return situacao;
  }


  /**
   * Sets the value of the 'situacao' field.
   * Situacao
   * @param value the value to set.
   */
  public void setSituacao(boolean value) {
    this.situacao = value;
  }

  /**
   * Creates a new Transacao RecordBuilder.
   * @return A new Transacao RecordBuilder
   */
  public static br.com.egois.schemaregistry.avro.Transacao.Builder newBuilder() {
    return new br.com.egois.schemaregistry.avro.Transacao.Builder();
  }

  /**
   * Creates a new Transacao RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Transacao RecordBuilder
   */
  public static br.com.egois.schemaregistry.avro.Transacao.Builder newBuilder(br.com.egois.schemaregistry.avro.Transacao.Builder other) {
    if (other == null) {
      return new br.com.egois.schemaregistry.avro.Transacao.Builder();
    } else {
      return new br.com.egois.schemaregistry.avro.Transacao.Builder(other);
    }
  }

  /**
   * Creates a new Transacao RecordBuilder by copying an existing Transacao instance.
   * @param other The existing instance to copy.
   * @return A new Transacao RecordBuilder
   */
  public static br.com.egois.schemaregistry.avro.Transacao.Builder newBuilder(br.com.egois.schemaregistry.avro.Transacao other) {
    if (other == null) {
      return new br.com.egois.schemaregistry.avro.Transacao.Builder();
    } else {
      return new br.com.egois.schemaregistry.avro.Transacao.Builder(other);
    }
  }

  /**
   * RecordBuilder for Transacao instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Transacao>
    implements org.apache.avro.data.RecordBuilder<Transacao> {

    /** Chave */
    private java.lang.CharSequence key;
    /** Nome */
    private java.lang.CharSequence nome;
    /** Documento */
    private java.lang.CharSequence documento;
    /** Situacao */
    private boolean situacao;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(br.com.egois.schemaregistry.avro.Transacao.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.nome)) {
        this.nome = data().deepCopy(fields()[1].schema(), other.nome);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.documento)) {
        this.documento = data().deepCopy(fields()[2].schema(), other.documento);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.situacao)) {
        this.situacao = data().deepCopy(fields()[3].schema(), other.situacao);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing Transacao instance
     * @param other The existing instance to copy.
     */
    private Builder(br.com.egois.schemaregistry.avro.Transacao other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nome)) {
        this.nome = data().deepCopy(fields()[1].schema(), other.nome);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.documento)) {
        this.documento = data().deepCopy(fields()[2].schema(), other.documento);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.situacao)) {
        this.situacao = data().deepCopy(fields()[3].schema(), other.situacao);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'key' field.
      * Chave
      * @return The value.
      */
    public java.lang.CharSequence getKey() {
      return key;
    }


    /**
      * Sets the value of the 'key' field.
      * Chave
      * @param value The value of 'key'.
      * @return This builder.
      */
    public br.com.egois.schemaregistry.avro.Transacao.Builder setKey(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.key = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'key' field has been set.
      * Chave
      * @return True if the 'key' field has been set, false otherwise.
      */
    public boolean hasKey() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'key' field.
      * Chave
      * @return This builder.
      */
    public br.com.egois.schemaregistry.avro.Transacao.Builder clearKey() {
      key = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'nome' field.
      * Nome
      * @return The value.
      */
    public java.lang.CharSequence getNome() {
      return nome;
    }


    /**
      * Sets the value of the 'nome' field.
      * Nome
      * @param value The value of 'nome'.
      * @return This builder.
      */
    public br.com.egois.schemaregistry.avro.Transacao.Builder setNome(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.nome = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'nome' field has been set.
      * Nome
      * @return True if the 'nome' field has been set, false otherwise.
      */
    public boolean hasNome() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'nome' field.
      * Nome
      * @return This builder.
      */
    public br.com.egois.schemaregistry.avro.Transacao.Builder clearNome() {
      nome = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'documento' field.
      * Documento
      * @return The value.
      */
    public java.lang.CharSequence getDocumento() {
      return documento;
    }


    /**
      * Sets the value of the 'documento' field.
      * Documento
      * @param value The value of 'documento'.
      * @return This builder.
      */
    public br.com.egois.schemaregistry.avro.Transacao.Builder setDocumento(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.documento = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'documento' field has been set.
      * Documento
      * @return True if the 'documento' field has been set, false otherwise.
      */
    public boolean hasDocumento() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'documento' field.
      * Documento
      * @return This builder.
      */
    public br.com.egois.schemaregistry.avro.Transacao.Builder clearDocumento() {
      documento = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'situacao' field.
      * Situacao
      * @return The value.
      */
    public boolean getSituacao() {
      return situacao;
    }


    /**
      * Sets the value of the 'situacao' field.
      * Situacao
      * @param value The value of 'situacao'.
      * @return This builder.
      */
    public br.com.egois.schemaregistry.avro.Transacao.Builder setSituacao(boolean value) {
      validate(fields()[3], value);
      this.situacao = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'situacao' field has been set.
      * Situacao
      * @return True if the 'situacao' field has been set, false otherwise.
      */
    public boolean hasSituacao() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'situacao' field.
      * Situacao
      * @return This builder.
      */
    public br.com.egois.schemaregistry.avro.Transacao.Builder clearSituacao() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Transacao build() {
      try {
        Transacao record = new Transacao();
        record.key = fieldSetFlags()[0] ? this.key : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.nome = fieldSetFlags()[1] ? this.nome : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.documento = fieldSetFlags()[2] ? this.documento : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.situacao = fieldSetFlags()[3] ? this.situacao : (java.lang.Boolean) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Transacao>
    WRITER$ = (org.apache.avro.io.DatumWriter<Transacao>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Transacao>
    READER$ = (org.apache.avro.io.DatumReader<Transacao>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.key);

    out.writeString(this.nome);

    out.writeString(this.documento);

    out.writeBoolean(this.situacao);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.key = in.readString(this.key instanceof Utf8 ? (Utf8)this.key : null);

      this.nome = in.readString(this.nome instanceof Utf8 ? (Utf8)this.nome : null);

      this.documento = in.readString(this.documento instanceof Utf8 ? (Utf8)this.documento : null);

      this.situacao = in.readBoolean();

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.key = in.readString(this.key instanceof Utf8 ? (Utf8)this.key : null);
          break;

        case 1:
          this.nome = in.readString(this.nome instanceof Utf8 ? (Utf8)this.nome : null);
          break;

        case 2:
          this.documento = in.readString(this.documento instanceof Utf8 ? (Utf8)this.documento : null);
          break;

        case 3:
          this.situacao = in.readBoolean();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










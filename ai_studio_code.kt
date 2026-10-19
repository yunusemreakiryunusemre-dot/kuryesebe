@Entity(tableName = "transactions")
data class TransactionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val amount: Double,
    val transactionType: String, // "HAKEDIS", "CASH_COLLECTION", "TIP", "EXPENSE", "HAKEDIS_PAYOUT"
    val isIncome: Boolean,
    val envelopeId: Int? = null,
    val envelopeName: String? = null,
    val vatRate: Int = 20,
    val vatAmount: Double = 0.0,
    val baseAmount: Double = 0.0,
    val timestamp: Long = System.currentTimeMillis(),
    val note: String? = null
)
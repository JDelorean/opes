package pl.jdev.oanda_rest_client.domain.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import pl.jdev.oanda_rest_client.domain.AbstractEntity;

import java.util.Currency;
import java.util.Date;

@Data
@Builder
@TypeAlias("account")
public class Account extends AbstractEntity {
    @Indexed
    @JsonProperty("id")
    private String accountId;
    private String alias;
    private Currency currency;
    private Double balance;
    private String createdByUserID;
    private Date createdTime;
    private GuaranteedStopLossOrderMode guaranteedStopLossOrderMode;
    private Double pl;
    private Double resettablePL;
    private Date resettablePLTime;
    private Double financing;
    private Double commission;
    private Double guaranteedExecutionFees;
    private Double marginRate;
    private Date marginCallEnterTime;
    private Integer marginCallExtensionCount;
    private Date lastMarginCallExtensionTime;
    private Integer openTradeCount;
    private Integer openPositionCount;
    private Integer pendingOrderCount;
    private Boolean hedgingEnabled;
    private Double unrealizedPL;
    private Double nav;
    private Double marginUsed;
    private Double marginAvailable;
    private Double positionValue;
    private Double marginCloseoutUnrealizedPL;
    private Double marginCloseoutNAV;
    private Double marginCloseoutMarginUsed;
    private Double marginCloseoutPercent;
    private Double marginCloseoutPositionValue;
    private Double withdrawalLimit;
    private Double marginCallMarginUsed;
    private Double marginCallPercent;
}
package com.webank.wedatasphere.exchangis.appconn.service;

import com.webank.wedatasphere.dss.standard.app.development.operation.RefExecutionOperation;
import com.webank.wedatasphere.dss.standard.app.development.service.AbstractRefExecutionService;
import com.webank.wedatasphere.exchangis.appconn.operation.ExchangisExecutionOperation;

public class ExchangisExecutionService extends AbstractRefExecutionService {
    @Override
    public RefExecutionOperation createRefExecutionOperation() {
        ExchangisExecutionOperation exchangisExecutionOperation = new ExchangisExecutionOperation(this);
        return exchangisExecutionOperation;
    }
}

/*
 * Copyright 2014 Samuel Franklyn <sfranklyn at gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sesawi.api;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Samuel Franklyn <sfranklyn at gmail.com>
 */
public interface TicketsRpc {

    public List<String> sendEntry(Map ticketsMap);    

    public List<String> sendExit(Map ticketsMap);
    
    public Integer receivePrice(Map ticketsMap);
    
    public List<Map> receiveEntry(String locationName);

    public List<Map> receiveEntryByTicketNo(String locationName, String ticketNo);

    public List<Map> receiveEntryByTicketPoliceNo(String locationName, String ticketNo);
}

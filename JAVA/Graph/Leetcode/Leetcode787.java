class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        HashMap<Integer, ArrayList<int[]>> adj = new HashMap<>();
        HashMap<Integer, Integer> visited = new HashMap<>();
        PriorityQueue<int []> que = new PriorityQueue<>((a,b) -> a[2] != b[2] ?  Integer.compare(a[2], b[2]) : Integer.compare(a[1], b[1]) );

        int cheapestPrice = Integer.MAX_VALUE;

        for(int i = 0 ; i < flights.length ; i++){
            int flightFrom = flights[i][0];
            int flightTo = flights[i][1];
            int cost = flights[i][2];

            if(adj.containsKey(flightFrom)){
                adj.get(flightFrom).add(new int [] {flightTo, cost});
            }
            else {
                adj.put(flightFrom, new ArrayList<>() );
                adj.get(flightFrom).add(new int [] {flightTo, cost});
            }
        }
        que.add(new int [] {src , 0 , -1});
        visited.put(src, 0);

        while(!que.isEmpty()){
            int [] details = que.poll();
            int city = details[0];
            int costTillNow = details[1];
            int citiesVisited = details[2];

            if(city == dst && citiesVisited <= k) {
                cheapestPrice = Math.min(cheapestPrice, costTillNow);
            }

            if(adj.containsKey(city)){
            List <int []> cityList = adj.get(city);

            for(int i = 0 ; i < cityList.size() ; i++){
                int connectingFlight [] = cityList.get(i);
                int flightTo = connectingFlight[0];
                int totalCost = connectingFlight[1] + costTillNow;

                if(visited.containsKey(flightTo)){
                    if(visited.get(flightTo) > totalCost && citiesVisited + 1 <= k){
                        que.add(new int [] {flightTo , totalCost , citiesVisited + 1});
                        visited.put(flightTo , totalCost);
                    }
                }
                else {
                    que.add(new int [] {flightTo , totalCost , citiesVisited + 1});
                    visited.put(flightTo , totalCost);
                }
                }
            }
        }
        return cheapestPrice == Integer.MAX_VALUE ? -1 : cheapestPrice;
    }
}
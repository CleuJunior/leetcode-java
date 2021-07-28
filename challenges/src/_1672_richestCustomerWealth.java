public class _1672_richestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max_wealth = 0;
        for(int index = 0; index < accounts.length; index++){
            int aux = 0;
            for(int j_index = 0; j_index < accounts[index].length; j_index++){
                aux += accounts[index][j_index];

                if(max_wealth <= aux) max_wealth = aux;

            }
            aux = 0;
        }

        return max_wealth;

    }
}

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, Integer> available = new HashMap<>();
        for (String supply : supplies) {
            available.put(supply, 1);
        }
        
        List<String> result = new ArrayList<>();
        boolean progress = true;  

        while (progress) {  
            progress = false;  
            for (int i = 0; i < recipes.length; i++) {
                if (available.containsKey(recipes[i])) continue;  
                
                boolean canMake = true;
                for (String ing : ingredients.get(i)) {
                    if (!available.containsKey(ing)) {
                        canMake = false;
                        break;
                    }
                }

                if (canMake) {
                    available.put(recipes[i], 1);
                    result.add(recipes[i]);
                    progress = true;
                }
            }
        }

        return result;
    }
}
